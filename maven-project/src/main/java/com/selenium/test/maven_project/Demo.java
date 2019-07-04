package com.selenium.test.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");// set the driver and set path
		WebDriver driver = new ChromeDriver();// initialize browser
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.findElement(By.id("LoginForm_username")).sendKeys("sadatk");
		driver.findElement(By.id("LoginForm_password")).sendKeys("sharukh@111");
		WebElement ele= driver.findElement(By.name("yt0"));
		ele.click();
		//commit
		//second
		//third
		//four
		//fifth
		//dfg
}
}