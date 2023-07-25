package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User have to launch Facebook application thru Chrome Browser")
	public void user_have_to_launch_Facebook_application_thru_Chrome_Browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password() {
	    WebElement txtEmail=driver.findElement(By.id("email"));
	    txtEmail.sendKeys("Greens");
	    WebElement txtPass=driver.findElement(By.id("pass"));
	    txtPass.sendKeys("1234567");
	}

	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
	    WebElement btnLogin=driver.findElement(By.name("login"));
	    btnLogin.click();
	}

	@Then("User have to reach the invalid credential page")
	public void user_have_to_reach_the_invalid_credential_page() {
	    String url = driver.getCurrentUrl();
	    if (url.contains("privacy_mutation_token")) {
	    	System.out.println("User is in invalid credential page");
			
		} 
	    else {
	    	System.out.println("User is not in invalid credential page");
		}    
	}
}
