package Lec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Get method apply on browser not on webelemets

		WebDriver driver = new ChromeDriver();

		// to open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000); // to wait

		// to maximize window
		driver.manage().window().maximize();

		// to get title
		String title = driver.getTitle();
		System.out.println(title);

		// return url of the current page
		System.out.println(driver.getCurrentUrl());

		// return source code of page
		System.out.println(driver.getPageSource());

		// return ID of single browser window
		System.out.println(driver.getWindowHandle());

		// return Set of IDs of all multiple browser windows in string format
		System.out.println(driver.getWindowHandles());

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		System.out.println(driver.getWindowHandles());

	}

}
