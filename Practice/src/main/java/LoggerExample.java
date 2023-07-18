

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerExample {

	public static void main(String[] args) {

		Logger logger =Logger.getLogger("LoggerExample");
		 DOMConfigurator.configure("log4j.xml");

		 int a =3; int b=5;	
		logger.info("adding 2 numbers");
		int c =a+b;
	     logger.info("added");
	       System.out.println("test completed");
	}

}
