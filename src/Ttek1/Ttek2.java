package Ttek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttek2 {
	public static <WebDriver> void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarif\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver ();
		((org.openqa.selenium.WebDriver) driver).get ("http://facebook.com");
		
		
		
	}
	
	
			

}
