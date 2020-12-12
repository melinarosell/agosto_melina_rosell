package dataProviders;

import org.testng.annotations.DataProvider;

public class DataEmail {

	@DataProvider (name = "login") 
	
	public static Object [][] login(){
		return new Object [][] {
			{"meliros_05@hotmail.com"},
			{"melina.a.rosell@gmail.com"},
			{"pepito@hotmail.com"},
		};
	}
}
