package com.actions.demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxProfiles {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		// Chrome profile
		// ChromeOptions chrome = new ChromeOptions();
		// chrome.addExtensions(new File("./extensions/KatalonChrome.crx"));
		// System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");

		// //firefox profile
		// ProfilesIni firefox = new ProfilesIni();
		// FirefoxProfile profile = firefox.getProfile("SauravTestProfile");
		// System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		// driver= new FirefoxDriver(profile);

		// FirefoxProfile profile = new FirefoxProfile();
		//Or
		//
		ProfilesIni firefox = new ProfilesIni();
		FirefoxProfile profile = firefox.getProfile("SauravTestProfile");
		//
		profile.setPreference("general.useragent.override", "iPhone");
		
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		driver = new FirefoxDriver(profile);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testcaseChrome() throws InterruptedException {
		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		WebElement dragItem = driver.findElement(By.id("draggable"));
		WebElement dropItem = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragItem, dropItem).perform();
		System.out.println(" --> Test Completed");
	}

	@AfterTest
	public void teardown() {

	}
}
