package sept04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NextTry {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rpednekar\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement url = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]"));


	}
	

}
