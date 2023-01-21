package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SampleTestCheck {
	
	public static WebDriver driver;

	
	@Test
	public void sampletesty() {
		
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//*[text()='Welcome Paul']")).click();
//			driver.findElement(By.xpath("//*[text()='Logout']")).click();
			driver.quit();
	        
	}

}
