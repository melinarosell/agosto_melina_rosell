package dataProviders;

import org.testng.annotations.Factory;

import tests.prueba_netflix;

public class FactoryNetflix {
	
	  @Factory
	    public Object[] salesforceEmailFactory(){
	        return new Object[] {
	                new prueba_netflix(),
	                new prueba_netflix(),
	                new prueba_netflix(),

	        };
	      
	    }

}
