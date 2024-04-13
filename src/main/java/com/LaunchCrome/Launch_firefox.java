package com.LaunchCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("web.driver.firefox.driver","C:\\Users\\yasht\\OneDrive\\Desktop\\ecclips\\geckodriver\\geckodriver.exe");
        
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("amazon");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("OSrXXb")).click();
        
        
        
        
	}

}
