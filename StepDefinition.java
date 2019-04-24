package com.learning1.stepdefinition;


import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.learning1.cucumber.ObjectRepository;
import com.learning1.utils.Report;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;


public class StepDefinition extends ObjectRepository {

	WebDriver driver;
	String appURL ="http://myntra.com" ;
	String formURL="https://mgsdemo.mgscoder.com/mgscode/regform/index-2.html";
	Fairy fairy = Fairy.create();
	Person person=fairy.person();
	Random   random = new Random();


	public static double getcvc(int min, int max){
		double x = (Math.random()*((max-min)+1))+min;
		return x;
	}	
	@Before
	public void start()
	{

		Report.reportLocation();

		Report.logger = Report.extent.createTest("Test Case 1:Verify Given scenario");
	}

	@When("^Two Numbers (\\d+) and (\\d+) are added$")
	public void two_Numbers_and(int a, int b) throws Exception {
		int sum=a+b;
		System.out.println("Sum of given two Numbers: "+sum);

	}

	@Then("^Sum is calculated successfully.$")
	public void User_finds_the_sum_of_the_given_numbers() throws Exception {

		System.out.println("Sum is calculated successfully.");
	}

	@When("^Calculates the page load time in Chrome$")
	public void Calculates_the_page_load_time_in_Chrome() throws Throwable {
		driver=new ChromeDriver();
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		driver.navigate().to(appURL);
		driver.findElement(By.xpath("//a[contains(text(),'ONLINE')]"));
		pageLoad.stop();
		long pageLoadTime_ms = pageLoad.getTime();
		float pageLoadTime_Seconds =(float) pageLoadTime_ms / 1000;
		System.out.println("Total Page Load Time from front end perspective in chrome: " + pageLoadTime_Seconds + " seconds");
		StopWatch pageLoad2 = new StopWatch();
		pageLoad2.start();
		WebElement element2=driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"));
		element2.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'clothing-sets') and contains(@class,'desktop')]")));
		pageLoad2.stop();
		long pageLoadTime_ms2 = pageLoad2.getTime();
		float pageLoadTime_Seconds2 =(float) pageLoadTime_ms2 / 1000;
		System.out.println("Load Time from end to end perspective in chrome: " +(pageLoadTime_Seconds+ pageLoadTime_Seconds2) + " seconds");
		driver.close();
	}



	@And("^Calculates the page load time in firefox$")
	public void Calculates_the_page_load_time_in_firefox() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); 
		driver=new FirefoxDriver();
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		driver.navigate().to(appURL);
		driver.findElement(By.xpath("//a[contains(text(),'ONLINE')]"));
		pageLoad.stop();
		long pageLoadTime_ms = pageLoad.getTime();
		float pageLoadTime_Seconds =(float) pageLoadTime_ms / 1000;
		System.out.println("Total Page Load Time from front end perspective: " + pageLoadTime_Seconds + " seconds");
		StopWatch pageLoad2 = new StopWatch();
		pageLoad2.start();
		WebElement element2=driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"));
		element2.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'clothing-sets') and contains(@class,'desktop')]")));
		pageLoad2.stop();
		long pageLoadTime_ms2 = pageLoad2.getTime();
		float pageLoadTime_Seconds2 =(float) pageLoadTime_ms2 / 1000;
		System.out.println("Load Time from end to end perspective: " +(pageLoadTime_Seconds+ pageLoadTime_Seconds2) + " seconds");
		driver.close();
	}

	@When("^Calculates the page load time in phantomJS$")
	public void Calculates_the_page_load_time_in_phantomJS() throws Throwable {
		driver=new PhantomJSDriver();
		StopWatch pageLoad = new StopWatch();
		pageLoad.start();
		driver.navigate().to(appURL);
		driver.findElement(By.xpath("//a[contains(text(),'ONLINE')]"));
		pageLoad.stop();
		long pageLoadTime_ms = pageLoad.getTime();
		float pageLoadTime_Seconds =(float) pageLoadTime_ms / 1000;
		System.out.println("Total Page Load Time from front end perspective: " + pageLoadTime_Seconds + " seconds");
		StopWatch pageLoad2 = new StopWatch();
		pageLoad2.start();
		WebElement element2=driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"));
		element2.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'clothing-sets') and contains(@class,'desktop')]")));
		pageLoad2.stop();
		long pageLoadTime_ms2 = pageLoad2.getTime();
		float pageLoadTime_Seconds2 =(float) pageLoadTime_ms2 / 1000;
		System.out.println("Load Time from end to end perspective: " +(pageLoadTime_Seconds+ pageLoadTime_Seconds2) + " seconds");
		driver.close();
	}


	@When("^Application is opened$")
	public void application_is_opened() throws Exception {
		driver=new ChromeDriver();
		driver.navigate().to(formURL);

	}
	@Then("^Traverse through the appliction$")
	public void traverse_the_form_with_appropriate_data_and_complete_the_wizard() throws Exception {
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(username));
		List<WebElement> forms=driver.findElements(noOfForms);
		System.out.println("No of Forms on current page: "+forms.size());
		driver.findElement(username).sendKeys(person.getUsername());
		driver.findElement(email).sendKeys(person.getEmail());
		String pass=person.getPassword();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmpassword).sendKeys(pass);
		driver.findElement(nextbutton2).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(firstname));
		forms=driver.findElements(noOfForms);
		System.out.println("No of Forms on current page: "+forms.size());
		driver.findElement(firstname).sendKeys(person.getFirstName());
		driver.findElement(lastname).sendKeys(person.getLastName());
		Select select =new Select(driver.findElement(gender));
		select.selectByValue("Male");;
		String day=String.valueOf(person.getDateOfBirth().getDayOfMonth());
		String month=person.getDateOfBirth().monthOfYear().getAsText();
		String year=person.getDateOfBirth().year().getAsText();
		String dateofbirth=day+" "+month+", "+year;
		driver.findElement(dob).sendKeys(dateofbirth);
		driver.findElement(address).sendKeys(person.getAddress().getAddressLine1());
		driver.findElement(phone).sendKeys(person.getTelephoneNumber());
		driver.findElement(contact).click();
		driver.findElement(nextbutton3).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(paymenttype));
		forms=driver.findElements(noOfForms);
		System.out.println("No of Forms on current page: "+forms.size());
		Select select1=new Select(driver.findElement(paymenttype));
		select1.selectByValue("Visa Card");
		driver.findElement(holdername).sendKeys(person.getFullName());
		long first14 = (long) (Math.random() * 100000000000000L);
		long card = 5200000000000000L + first14;
		System.out.println(card);
		driver.findElement(cardnumber).sendKeys(String.valueOf(card));
		driver.findElement(cvc).sendKeys(String.valueOf(getcvc(100, 999)));
		driver.findElement(expirydate).sendKeys("March, 2023");
		driver.findElement(agreechk).click();
		driver.findElement(nextbutton4).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(firstdigit));
		forms=driver.findElements(noOfForms);
		System.out.println("No of Forms on current page: "+forms.size());
		String firstdigit1=driver.findElement(firstdigit).getAttribute("value");
		String lastdigit1=driver.findElement(seconddigit).getAttribute("value");
		int digit1=Integer.parseInt(firstdigit1);
		int digit2=Integer.parseInt(lastdigit1);
		int sum=digit1+digit2;
		driver.findElement(captcha).sendKeys(String.valueOf(sum));
		driver.findElement(submitbutton).click();
		wait1.until(ExpectedConditions.elementToBeClickable(OKbutton));
		driver.findElement(OKbutton).click();
	}

	@Then("^Test the Application (\\d+) times$")
	public void run_times_with_random_data(int arg) throws Throwable {
		for(int i=1;i<=arg;i++)
		{
			traverse_the_form_with_appropriate_data_and_complete_the_wizard();
			verify_message("You have finished all steps of this html form successfully");
			driver.navigate().refresh();
		}
	}

	@Then("^verify message \"([^\"]*)\"$")
	public void verify_message(String arg1) throws Throwable {
		String actualmessage=driver.findElement(message).getText();
		if(actualmessage.contains(arg1))
		{
			System.out.println("Message is verified successfully");
			Report.logger.log(Status.PASS, "Message is verified successfully");
		}
		else
		{
			System.out.println("Message not verified");
			Report.logger.log(Status.FAIL, "Message is verified successfully");
		}

	}

	@After
	public void close()
	{
		driver.quit();
		Report.extent.flush();
	}

}

