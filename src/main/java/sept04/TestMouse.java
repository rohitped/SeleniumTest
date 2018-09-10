package sept04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rpednekar\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://uatb01.auruspay.com/whizpay/home.do?action=indexManager&loginType=Backoffice");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

		System.out.println(driver.findElement(By.xpath("//input[@src='images/whizPay.net/btn_logIn.jpg']")).isDisplayed());
		
	
		
		WebElement Image = driver.findElement(By.xpath("//input[@src='images/whizPay.net/btn_logIn.jpg']"));
		
		Point point = Image.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("Location of X axis is " +x);
		System.out.println("Location of Y axis is " +y);
		
		
		
	
	//	driver.findElement(By.xpath("//input[@src='images/whizPay.net/btn_logIn.jpg']")).click();
		
		
		
		
		
		
		
		Actions act = new Actions(driver);
		
	//	act.moveToElement(driver.findElement(By.xpath("//input[@src='images/whizPay.net/btn_logIn.jpg"))).click().build().perform();
		
	//	act.moveByOffset(x, y).click().perform();
	//	act.moveToElement(Image, x, y).click().perform();
		
		
		act.moveToElement(Image).click().perform();
		
	
	//	act.click(driver.findElement(By.xpath("//input[@src='images/whizPay.net/btn_logIn.jpg']")));
		
		
		System.out.println("clicked???");
	}

}
