package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks extends Utility {
	@Before
	public void beforeScenario(Scenario s) {
		System.out.println(" hooks-before");
		String name = s.getName();
		System.out.println(name);
	}

	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] fbimage = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(fbimage, "image/png");
	}

	/*
	 * @Before(order=1) public void beforeScenario1() {
	 * System.out.println("hooks-before1");
	 * 
	 * }
	 */

}
