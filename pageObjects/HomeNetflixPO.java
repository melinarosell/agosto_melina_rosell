package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeNetflixPO {
	
	WebDriver driver;
	
	  public HomeNetflixPO (WebDriver aDriver){
	        this.driver = aDriver;
	    }
	
    public void clickBotonComienzaYa() {
    	driver.findElement(By.xpath("//button[@class= 'btn btn-red nmhp-cta nmhp-cta-extra-large btn-none btn-custom']")).click();
    }
	
 
    public void completarEmail (String anEmail) {
    	driver.findElement(By.id("id_email_hero_fuji")).sendKeys(anEmail);
  

    }
    
 

}
