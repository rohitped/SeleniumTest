package sept04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
	//	System.setProperty("webdriver.chrome.driver", "E:\\Rohit\\chromedriver_win32(1)\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rpednekar\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	//	Thread.sleep(5000);
		

	}

}
