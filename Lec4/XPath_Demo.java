package Lec4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// XPath with single attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("XPath1 ");

		// XPath with single attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']"))
				.sendKeys("XPath2 ");

		// XPath with 'and' & 'or' operators
		driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']"))
				.sendKeys("XPath-and ");
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']"))
				.sendKeys("XPath-or ");

		// XPath with inner text or linktext ----> we use text() method
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		String getText = driver.findElement(By.xpath("//a[text()='Search']")).getText();
		System.out.println(getText);

		// XPath with contains() ----> it contain partial value like Sea of Search or
		// earc of Search
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Contains ");

		// XPath with starts-with() ----> same like contain but should start with ggiven
		// value
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("StartsWith ");

		// Chained XPath
		boolean isDiplay = driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(isDiplay);

	}

}
