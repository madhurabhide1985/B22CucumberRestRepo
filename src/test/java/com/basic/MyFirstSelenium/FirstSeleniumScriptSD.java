package com.basic.MyFirstSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumScriptSD {
	
	WebDriver driver;
	
	@Given("^User Opens seleniumhq website$")
	public void User_Opens_seleniumhq_website11(){
		//System.setProperty("webdriver.chrome.driver","D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver_win32_B39\\chromedriver.exe");
		//driver = new ChromeDriver();
//		For Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "E:\\Madhura\\RadicalSelinumTraining\\TrainingSoftware\\SeleniumSoftware\\chromedriver_win32_B39-20200517T064814Z-001\\chromedriver_win32_B39\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();	
//		For Firefox
		System.setProperty("webdriver.gecko.driver", "E:\\Madhura\\RadicalSelinumTraining\\TrainingSoftware\\SeleniumSoftware\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.seleniumhq.org/");
	}
	
	@When("^user click on \"([^\"]*)\" tab$")
	public void user_click_on_Project_tab(String tabName){
		System.out.println("tab name = "+tabName);
		driver.findElement(By.xpath("")).click();
	}
	
	@Then("^user checks About tab$")
	public void user_checks_About_tab(){
		Assert.assertTrue(true);
	}

}
