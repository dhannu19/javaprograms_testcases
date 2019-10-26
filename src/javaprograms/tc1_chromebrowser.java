package javaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_chromebrowser {

	public static void main(String[] args) {
		System.out.println("Chrome Browser Launch");
		//https://seleniumhq.github.io/selenium/docs/api/java/index.html
		//Under build path always Add external jars under the Class path 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pkabadi\\Desktop\\Drivers all\\chromedriver.exe");
         WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
	}

}
