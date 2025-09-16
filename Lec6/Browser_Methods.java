package Lec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000); // to wait
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);

		// Whenever we open 2 browser windows driver focuses on first browser window

		// Close:- it will close first browser window
//		driver.close();

		// quit:- it will close all windows of browser
		driver.quit();
	}

}
