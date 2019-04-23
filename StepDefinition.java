package com.learning1.stepdefinition;


import java.util.Date;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	String appURL ="http://myntra.com" ;
	String formURL="https://mgsdemo.mgscoder.com/mgscode/regform/index-2.html";
	
@Before
public void start()
{
	
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
public void application_is_opened() throws Throwable {
	driver=new ChromeDriver();
	driver.navigate().to(formURL);
    throw new PendingException();
}

@Then("^Determine no of forms present on page$")
public void determine_no_of_forms_present_on_page() throws Throwable {
    
    throw new PendingException();
}

@Then("^Traverse the form with appropriate data and complete the wizard$")
public void traverse_the_form_with_appropriate_data_and_complete_the_wizard() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Run (\\d+) times with random data$")
public void run_times_with_random_data(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^verify message \"([^\"]*)\"$")
public void verify_message(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}



}

