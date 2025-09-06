package Lec5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axes_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();

		// Self
		String text = driver.findElement(By.xpath("//a[normalize-space()='Avantel Ltd.']/self::a")).getText();
		System.out.println("Self :-  " + text);

		// Parent
		text = driver.findElement(By.xpath("//a[normalize-space()='Avantel Ltd.']/parent::td")).getText();
		System.out.println("Parent :-  " + text);

		// Ancestor --> Parent and GrandParent
		text = driver.findElement(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr")).getText();
		System.out.println("Ancestor :-  " + text);

		// Child
		List<WebElement> list = driver
				.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/child::td"));
		System.out.println("Number of Child Elements :-  " + list.size());

		// Descendants :--> Child & GrandChilds
		list = driver.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/descendant::*"));
		System.out.println("Number of Descendants Elements :-  " + list.size());

		// Following Nodes
		list = driver.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/following::tr"));
		System.out.println("Number of Following Nodes :-  " + list.size());

		// Following Siblings
		list = driver
				.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of Following Siblings Nodes :-  " + list.size());

		// Preceding Nodes
		list = driver.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding Nodes :-  " + list.size());

		// Preceding Siblings
		list = driver
				.findElements(By.xpath("//a[normalize-space()='Avantel Ltd.']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding Siblings Nodes :-  " + list.size());

		driver.close();
	}

}
