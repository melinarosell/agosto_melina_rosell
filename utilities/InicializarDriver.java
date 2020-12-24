package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InicializarDriver {

	

	public static WebDriver abrirNavegador(String URL){
		
		//Los valores posibles son: Firefox, Chrome o Edge//
		
		WebDriver driver;
		
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromeDriver/chromedriver86.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			
	
		return driver;
	}


}
