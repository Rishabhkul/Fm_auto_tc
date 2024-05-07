package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mt_1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.zoho.com");
		driver.manage(). window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("rish.9917@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9917018188");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		//driver.findElement(By.xpath("//span[@class='icon-google_small fedicon']//span[@class='path4']")).click();
		
}
	
}