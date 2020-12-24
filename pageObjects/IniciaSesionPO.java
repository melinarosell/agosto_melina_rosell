package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class IniciaSesionPO {


	WebDriver driver;
	
    public IniciaSesionPO (WebDriver aDriver){
        this.driver = aDriver;
    }

    public void clickBotonIniciaSesion() {
    	driver.findElement(By.xpath("//button[contains(text(), 'Iniciar sesión')]")).click();
    }
	

 
    public void completarLogin (String anEmail, String aPassword) {
    	driver.findElement(By.id("id_userLoginId")).sendKeys(anEmail);
    	driver.findElement(By.id("id_password")).sendKeys(aPassword);

    }
    
    public void clickCheckRecuerdame () {
    	driver.findElement(By.id("bxid_rememberMe_true")).click();

    }

}
