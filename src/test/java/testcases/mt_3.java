package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadXlsdata;

public class mt_3 extends BaseTest {
	//@Test(dataProvider="testdata")
	@Test(dataProviderClass=ReadXlsdata.class, dataProvider="bvtdata")

	public static void LoginTest(String username,String password) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.zoho.com");
		driver.manage(). window().maximize();
		//driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		//driver.findElement(By.xpath("//span[@class='icon-google_small fedicon']//span[@class='path4']")).click();
		
}
	/*@DataProvider(name="testdata")
	public Object[] [] tData( )
	{
	return new Object[] []
	{
	{"c@gmail.com", "testautn@1546456"},
	{"rcvtutail.com", "testauto23"},
	{"rcvtutomail.com", "testautoma67567@123"},
	{"rish.9917@gmail.com", "9917018188"}
	};
	}*/
	
}