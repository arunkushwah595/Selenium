package Lec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		// isDisplayed
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Displaying logo status:- " + status);

		// isEnabled :- check webelement(i.e. search box) is enabled or not
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Displaying search box enable status:- " + searchBox.isEnabled());

		// to check element is selected or not like radio buttons, drop downs etc.
		WebElement radiobutton = driver.findElement(By.xpath("//span[@class='male']"));
		System.out.println("Before selecting male radio button :- " + radiobutton.isSelected());

		radiobutton.click();

		System.out.println("After selecting male radio button:- " + radiobutton.isSelected());

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println("Check Box is selected ? " + checkbox.isSelected());

	}

}
