package testpage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class aboutUsTests {
	WebDriver driver;

	
	@Test
	public void getUrl() {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless","--no-sandbox","--disable-dev-shm-usage","start-maximized","disable-infobars","--disable-extensions","--disable-gpu");
	driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("http://54.144.204.139:5775/");

	
	driver.findElement(By.xpath("//a[@id='About Us']")).click();
	String aboutUsPageContent = driver.getPageSource();
	System.out.println("aboutUsPageContent :" + aboutUsPageContent);
	Assert.assertTrue(aboutUsPageContent.contains("about"));
	driver.quit();
	
	
	}	
}


