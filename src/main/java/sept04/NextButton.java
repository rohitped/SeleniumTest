package sept04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NextButton {

	static WebDriver driver;
	public static boolean isElementVisible(String xpath){
		
		try{
			
		driver.findElement(By.xpath(xpath));
		return true;
		}catch (Exception e){
			return false;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rpednekar\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "E:\\Rohit\\chromedriver_win32(1)\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://gsuite.google.com/signup/basic/welcome");

		
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		
//................ BusinessName.....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[2]/div/div[1]/div/div[1]/input")).sendKeys("roadd");
		
		//................ Number of Employees .....................	
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[3]/div/div[1]/content/label[1]/div/div[3]/div")).click();
		
		//................Country .....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[5]/div/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		System.out.println("Country1");
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[5]/div/div[2]/div[1]/div[2]/div[1]")).click();
		System.out.println("Country2");
		//................Next button_ First Page .....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[6]/div/div/content/span")).click();
		
		//*******************.....What's your contact info?  PAGE ......******************************
		//................ FirstNAme.....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[2]/div[1]/div[1]/div/div[1]/input")).sendKeys("ravi");
		
		//................LastName .....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("bhakti");
		
		//................Current email addr .....................
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[3]/div/div[1]/div/div[1]/input")).sendKeys("wew@ramm.com");

		//................ Next _ second Page .....................
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[4]/div/div/content/span")).isDisplayed());
		System.out.println("LEts see if it gets clicked");
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[4]/div/div/content/span")).click();
		
	//	driver.findElement(By.xpath(".//*[@id='yDmH0d']/c-wiz[2]/div[2]/section/div/div[1]/div[1]/c-wiz[4]/div/div/content/span")).click();
		
			//***************************..... Does your business have a domain?......**********************
		
		//................ Domain Selection .....................
		
		
		System.out.println(driver.findElement(By.xpath(".//div[@id='bring']")).getText());
		
	//	driver.findElement(By.xpath(".//div[@id='bring']")).click();
		
	//	System.out.println(driver.findElement(By.xpath("//div[@role='button']")).isDisplayed());

		
	//	WebElement button = driver.findElement(By.xpath(".//div[@id='bring']"));
		
		
		WebElement button = driver.findElement(By.xpath(".//*[@id='bring']/div[2]"));
		
		System.out.println(isElementVisible(".//*[@id='bring']/div[2]"));
		
		
		
		System.out.println(button.isDisplayed());
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("IS it getting printed?");
		
	//	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'I have'])")).isDisplayed());
		
	//	driver.findElement(By.xpath(".//*[@id='bring']/content/span")).click();
		
		//................ .....................
		
		
		
		//................ .....................
		
		
		
		//................ .....................
		
		
		//................ .....................
	
	
	
	}


}
