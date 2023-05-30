package org.google.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver ;
	}
	public void openApp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	public void tap(WebElement element) {
		element.click();
	}
	public void select(WebElement element, String string) {
		Select sc = new Select(element);
		sc.selectByValue(string);
	}
	public void screenshot(String name)  {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File input = ts.getScreenshotAs(OutputType.FILE);
			File output = new File("C:\\Users\\siddu\\Pictures\\Screenshots\\Co.Screenshot\\"+name+".png");
			FileUtils.copyFile(input, output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	public void orderId(WebElement element)  {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30, 10));
		String attribute = element.getAttribute("value");
		System.out.println("Order Id - " + attribute);
	}
	
	public void javascript(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
			
		}
	public void closeWindow() {
		driver.close();
		
	}
			
}


