package com.actions.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandling {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(enabled=false)
	public void singleFrame() throws InterruptedException {
		driver.get("https://jqueryui.com/dialog/");
		Thread.sleep(2000);
		//driver.switchTo().frame(By.className("demo-frame"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
	}
	
	@Test(enabled=false)
	public void multipleFrame() throws InterruptedException {
		driver.get("https://jqueryui.com/dialog/");
		Thread.sleep(2000);
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
	}

	@Test(enabled=false)
	public void multiframetwo() throws InterruptedException {
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement frame1= driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		String text= driver.findElement(By.xpath("//h1[contains(text(),'is displayed in an')]")).getText();
		System.out.println(text);
	}
	
	@Test(enabled=false)
	public void javascriptExecutor() {
		
		//driver.get("https://www.seleniumhq.org/download/");
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium hq");
		WebElement ele= driver.findElement(By.name("btnK"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click;",ele);		
		jse.executeScript("window.scrollBy(0,800);");	
	}
	
	@Test(enabled=false)
	public void method1() {
		driver.get("");
		
	}
	
	@Test(enabled=false)
	public void method2() {
		
	}
	
	@Test(enabled=false)
	public void method3() {
		
	}
	
	@Test(enabled=false)
	public void method4() {
		
	}
	
	
	
	
}
