package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends Utility {
	WebDriver driver;
	@Given("Launches fb login page")
	public void launches_fb_login_page() {
		browserLaunch();	
	}
	@When("User enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}
	@When("User print page title")
	public void user_print_page_title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User print URL of the page")
	public void user_print_url_of_the_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Then("User verifies the Error message")
	public void user_verifies_the_error_message() {
	System.out.println("Done");
	}
	
}