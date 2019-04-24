package com.learning1.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectRepository {
	
	
	public By noOfForms=By.xpath("//form");
	public By username=By.id("uname");
	public	 By email=By.id("email");
	public	By password=By.id("pass");
	public	 By confirmpassword=By.id("cpass");
	public By nextbutton2=By.xpath("//button[contains(@onclick,'nextStep2')]");
	public	 By firstname=By.id("fname");
	public	 By lastname=By.id("lname");
	public By gender=By.id("gender");
	public By dob=By.id("birthdate");
	public By address=By.id("address");
	public	 By phone=By.id("phone");
	public	 By contact=By.xpath("//input[@value='email']");
	public By nextbutton3=By.xpath("//button[contains(@onclick,'nextStep3')]");
	public By paymenttype=By.id("paymenttype");
	public By holdername=By.id("hname");
	public	 By cardnumber=By.id("cardnumber");
	public By cvc=By.id("cvc");
	public By expirydate=By.id("expirydate");
	public By agreechk=By.id("aggre");
	public By nextbutton4=By.xpath("//button[contains(@onclick,'nextStep4')]");
	public	By firstdigit=By.id("mathfirstnum");
	public	By seconddigit=By.id("mathsecondnum");
	public	By captcha=By.id("humanCheckCaptchaInput");
	public	By submitbutton=By.id("Submit");
	public By OKbutton=By.xpath("//button[@class='confirm']");
	public By message=By.xpath("//div[contains(@class,'text-success')]");
	
}