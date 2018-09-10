package sept04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.LinuxEphemeralPortRangeDetector;
import org.openqa.selenium.net.PortProber;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSept {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.out.println(PortProber.findFreePort());
		System.out.println("Hello");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rpednekar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rpednekar\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
	//	WebDriver driver = new InternetExplorerDriver();
	//	WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(("html/body/app-root/app-home/app-header/div[2]/div[2]/div[1]/a[2]"))).click();
		
		
		driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("rrrpednekar");

		driver.findElement(By.xpath(".//*[@id='usrPwd']")).sendKeys("Talent123");
	
		driver.findElement(By.xpath(".//*[@id='cnfUsrPwd']")).sendKeys("Talent123");

		
		
		driver.findElement(By.xpath((".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/label"))).click();

		driver.findElement(By.xpath((".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[4]/span"))).click();

		driver.findElement(By.xpath((".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[5]/div[4]/input"))).sendKeys("fggg");

		driver.findElement(By.xpath((".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[6]/div[2]/p-dropdown/div/label"))).click();

		driver.findElement(By.xpath((".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[6]/div[2]/p-dropdown/div/div[4]/div/ul/li[1]/span"))).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Rohit");

		driver.findElement(By.xpath(".//*[@id='middleName']")).sendKeys("Avinash");

		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("Pednekar");

		driver.findElement(By.xpath(".//*[@id='M']")).click();

		
		System.out.println("starttttttt");
		                             
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/input")).click();
		
		System.out.println("whatsup");
		
	
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/div/div/select[1]"));
		
		
		System.out.println("working after dropdown");
		
		
		Select sel = new Select(dropdown);
		
		sel.selectByValue("4");
		
		
		WebElement dropdown_date = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/div/div/select[2]"));
		
		Select sel1 = new Select(dropdown_date);
		
		sel1.selectByValue("1991");
		
				
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[2]/p-calendar/span/div/table/tbody/tr[5]/td[1]/a")).click();
		

	//............ Occupation.............
		
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/label")).click();
		
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/li[5]/span")).click();
		
	//..............Marital Status...........
		
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[11]/div[2]/label[1]/input")).click();
		
		
	//............ Country..................
		
		WebElement dropdown_country = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[12]/div[2]/select"));
		
		Select dd_country = new Select(dropdown_country);
		
		dd_country.selectByValue("94");
		
	//..............Email........................	
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rpednekar@aurus.com");
		
	//.................Mobile num.......................	
		
		driver.findElement(By.xpath(".//*[@id='mobile']")).sendKeys("8087470940");		
	
	//............. Nationality.................
			
		WebElement Dropdown_nationality = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[13]/div[5]/select"));
		
		Select sel2 = new Select(Dropdown_nationality);
		
		sel2.selectByValue("94");
		
	//...................Flat/door/block...................................	
		
		driver.findElement(By.xpath(".//*[@id='resAddress1']")).sendKeys("23/32/33");
		
	//.............PinCode..................
		
		driver.findElement(By.xpath(".//*[@id='resPinCode']")).sendKeys("411044");
		
		
		
		
		
	//................State...................
		
		driver.findElement(By.xpath(".//*[@id='resState']")).click();
		
	//..................city/town.........................	
		
		
		System.out.println("worrrrrrrrrrrkinggggggggggggggggggg");
		
		
		
		
		WebElement dropdown_city = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[17]/div[4]/select"));
		
		Select dd_city = new Select(dropdown_city);
	
		dd_city.selectByValue("Pune");
		
	//.............Postoffice...........................
		
		WebElement dropdown_Postoffice = driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[18]/div[2]/select"));
		
		Select dd_postOffice = new Select(dropdown_Postoffice);
		
		dd_postOffice.selectByValue("P.C.N.T. S.O");
		
	//..................phone.................
		
		driver.findElement(By.xpath(".//*[@id='resPhone']")).sendKeys("8684578458");
		
	//.........copyResidence.......................
		
		driver.findElement(By.xpath(".//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[19]/div[2]/input")).click();
		
		
	//...........Captcha
		
		
		
		
		
		
		
		
		
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("rohit");
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("rohit");
		Thread.sleep(5000);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement elements = driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
		
	//	elements.getTagName();
		
	//	elements.click();
		
		
		
		//LinuxEphemeralPortRangeDetector le = new LinuxEphemeralPortRangeDetector(null);
		
	//	PortProber.START_OF_USER_PORTS=1025;
		
		
		
	
	}
	
	void add(){
		
		
	}

}
