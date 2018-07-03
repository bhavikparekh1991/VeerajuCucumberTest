package com.cucumber.Selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	JavascriptExecutor jst= (JavascriptExecutor) driver;
	public static String baseURL = "https://dzone.com/";

	public void createDriver() throws MalformedURLException,
	InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Users/bhavik.p/Downloads/chromedriver_win32/chromedriver.exe");	
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	driver.get(baseURL);

	waitVar = new WebDriverWait(driver, 15);
	}

	public void teardown() {
	driver.quit();
	}

	public void ishomepageDisplayed() {
	waitVar.until(ExpectedConditions.presenceOfElementLocated(By
	.linkText("Log In")));

	driver.findElement(By.linkText("Log In")).isDisplayed();
	}

	public void clickSigninLink() throws InterruptedException {
	driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(10000);
	}

	public void isloginsectionDisplayed() {
	WebElement TextBox = driver.findElement(By.xpath("//*[@id='ngdialog1']/div[2]/div[2]/users-login-form/div[3]/div[2]/form/div[2]/input"));
	WebElement login = driver.findElement(By.xpath("//*[@id='ngdialog1']/div[2]/div[2]/users-login-form/div[3]/div[2]/form/div[6]/button"));
	
	jst.executeScript("arguments[0].value='Kirtesh';", TextBox);
	jst.executeScript("arguments[0].click();", login);
	}

}

