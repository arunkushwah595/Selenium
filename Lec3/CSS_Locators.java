package Lec3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize(); // maximize the browser

		// tag id -----> tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptops");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Laptops");  //Both are same

		// tag class ----> tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

		// tag attributes ----> tag[attribute = "value"]
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Mobiles");
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Mobiles");

		// tag class attribute ----> tag.class[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Mouse");

	}

}
