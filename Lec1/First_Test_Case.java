package Lec1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Test_Case {

//	Test case
//	1) Launch Browser(Chrome)
//	2) Open URL https://google.com
//	3) Validate title should be "Google"
//	4) Close Browser

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1) Lauch Browser(Chrome)
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

//		2) Open URL https://demo.opencart.com/
		driver.get("https://google.com");

//		3) Validate title should be "Google"
		String actual_title = driver.getTitle();

		if (actual_title.equals("Google")) {
			System.out.println("Test Passed");
		}

		else {
			System.out.println("Test Failed");
		}

//		4) Close Browser
//		driver.close();
//		driver.quit();
	}

}
