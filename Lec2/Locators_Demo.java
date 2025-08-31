package Lec2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// name
//		WebElement found_element = driver.findElement(By.name("q"));
//		found_element.sendKeys("Laptops");

		// id
//		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplayStatus);

		// linkText & partiallinkText
//		driver.findElement(By.linkText("Cart")).click();
//		driver.findElement(By.partialLinkText("Car")).click();

		// Class Name
		WebElement found_class = driver.findElement(By.className("gLFyf"));
		found_class.sendKeys("Hey Arun!");

		// tag name
		List<WebElement> found_tags = driver.findElements(By.tagName("a"));
		System.out.println("Total no of a tags: " + found_tags.size());

	}

}
