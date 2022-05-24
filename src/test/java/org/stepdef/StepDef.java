package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
	@Given("initialize application on the chrome browser")
	public void initialize_application_on_the_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.blazedemo.com/");
	
	}

	@When("user enter the Valid information on Departure {string} to Destination {string}")
	public void user_enter_the_Valid_information_on_Departure_to_Destination(String string, String string2) {
	  WebElement departure = driver.findElement(By.name("fromPort"));
	 Select select = new Select(departure);
	 select.selectByValue(string);
	  
	  WebElement destination = driver.findElement(By.name("toPort"));
	  Select select1 = new Select(destination);
	  select1.selectByValue(string2);
	  
	  WebElement textprint = driver.findElement(By.xpath("//p[text()='The is a sample site you can test with BlazeMeter! ']"));
	  String text = textprint.getText();
	  System.out.println(text);
	}

	@When("click find flights")
	public void click_find_flights() {
	    WebElement btnClick = driver.findElement(By.xpath("//input[@type='submit']"));
	    btnClick.click();
	}

	@When("click the selective flights")
	public void click_the_selective_flights() {
		 WebElement btnClick = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		    btnClick.click();
	}

	@When("enter the name {string} address {string} city {string} state {string} zip Code {string} card Type {string} credit Card Number {string} month {string} year {string} name on Card {string}")
	public void enter_the_name_address_city_state_zip_Code_card_Type_credit_Card_Number_month_year_name_on_Card(String name, String address, String city, String state, String zipcode, String cardtype, String creditcardNo, String month, String year, String nameOncard) {
	   
		WebElement typename = driver.findElement(By.id("inputName"));
		typename.sendKeys(name);

		WebElement typeaddress = driver.findElement(By.id("address"));
		typeaddress.sendKeys(address);
		
		WebElement typecity = driver.findElement(By.id("city"));
		typecity.sendKeys(city);
		
		WebElement typestate = driver.findElement(By.id("state"));
		typestate.sendKeys(state);
		
		WebElement typezipCode = driver.findElement(By.name("zipCode"));
		typezipCode.sendKeys(zipcode);
		
		//WebElement typecardType = driver.findElement(By.xpath("//select[@id='cardType']"));
		//Select select = new Select(typecardType);
		//select.selectByValue(cardtype);
		
		WebElement typecreditCardNumber = driver.findElement(By.id("creditCardNumber"));
		typecreditCardNumber.sendKeys(creditcardNo);
		
		WebElement typemonth = driver.findElement(By.id("creditCardMonth"));
		typemonth.sendKeys(month);
		
		WebElement typeyear = driver.findElement(By.id("creditCardYear"));
		typeyear.sendKeys(year);
		
		WebElement typenameOnCard = driver.findElement(By.id("nameOnCard"));
		typenameOnCard.sendKeys(nameOncard);
		
		WebElement btnclick = driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
		btnclick.click();
	}

	@Then("validate the purchase flight")
	public void validate_the_purchase_flight() {
	   System.out.println("Flght has been purchased successfully");
	}

}
