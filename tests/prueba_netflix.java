package tests;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataProviders.DataEmail;
import pageObjects.HomeNetflixPO;
import pageObjects.IniciaSesionPO;
import utilities.FakersFactory;
import utilities.InicializarDriver;

public class prueba_netflix {
	
	private WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		driver  = InicializarDriver.abrirNavegador("https://www.netflix.com/") ;
		//Thread.sleep(6000);
	}

	

	@Test 
	
	public void validarTituloTest ()  {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle ();
		System.out.println(actualTitle);
	    Assert.assertEquals(actualTitle, "Netflix Argentina: Ve series online, ve pel�culas online");
		
	
		
	}
	
	@Test 
	
	public void iniciarSesionPageTest ()  {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Iniciar sesi�n")).click();
		
		String actualTitle = driver.getTitle ();
	    Assert.assertNotEquals(actualTitle, "Netflix Argentina: Ve series online, ve pel�culas online");
	    
	    List<WebElement> tagList = driver.findElements(By.tagName("h1"));

        for (WebElement element : tagList) {
            System.out.println(element.getText());
        }

        WebElement textoIniciaSesionFacebook =  driver.findElement(By.xpath("//*[contains(text(),'Iniciar sesi�n con Facebook')]"));
        Assert.assertEquals(textoIniciaSesionFacebook.getText(), "Iniciar sesi�n con Facebook");
	
		
	}
	
	@Test 
	
	public void loginToNetflixErrorTest ()  {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@href= '/login']")).click();
		
		IniciaSesionPO iniciaSesion = new IniciaSesionPO (driver);
		
		
		iniciaSesion.completarLogin("test@test.com", "holamundo");
		iniciaSesion.clickCheckRecuerdame();
		iniciaSesion.clickBotonIniciaSesion();
		
		WebElement claveIncorr =  driver.findElement(By.xpath("//*[contains(text(),'Contrase�a incorrecta.')]"));
        Assert.assertEquals(claveIncorr.getText(), "Contrase�a incorrecta.");
		
	}
	
	@Test 
	
	public void fakeEmailTest ()  {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomeNetflixPO homeNetflix = new HomeNetflixPO (driver);
		homeNetflix.completarEmail(FakersFactory.getEmail());
		homeNetflix.clickBotonComienzaYa();
		
	}
	
	@Test (dataProvider = "login", dataProviderClass = DataEmail.class)
	
	public void dataProviderEmailTest (String anEmail)  
	
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomeNetflixPO homeNetflix = new HomeNetflixPO (driver);
		homeNetflix.completarEmail(FakersFactory.getEmail());
		homeNetflix.clickBotonComienzaYa();
		
	}
	@AfterMethod
	    public void after() {
	      
	       driver.quit();
	    }


}
