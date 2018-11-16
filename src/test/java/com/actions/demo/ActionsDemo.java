package com.actions.demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsDemo {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(enabled = false)
	public void loginTest() throws InterruptedException {
		driver.get("https://www.homeshop18.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Later']")).click();
		Actions act = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("(//a[text()='Digital'])[1]"));
		act.moveToElement(element1).perform();
		System.out.println("-->> Digital Link clicked");
	}

	@Test(enabled = false)
	public void googleNavigation() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(""));
	}

	@Test(enabled = false)
	public void rightclick() throws InterruptedException {

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(rightclickButton).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

	@Test(enabled = true)
	public void dragFunction() throws InterruptedException {
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		WebElement dragItem = driver.findElement(By.id("draggable"));
		WebElement dropItem = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragItem, dropItem).perform();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}
}
