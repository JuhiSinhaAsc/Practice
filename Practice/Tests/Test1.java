import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

Webdriver driver;

	public class Test {
		public  WebDriver driver;
		
		@BeforeMethod	
		public void setup() {
		     
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void test() {
			String id ="gunjankaushik";
			String pwd ="Password@123";
			System.out.println("id n pwd:    " +id +"   "+pwd);
			
		}
		@AfterMethod
		public void close() {
			driver.quit();
			
		}

}