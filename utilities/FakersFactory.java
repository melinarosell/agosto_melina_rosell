package utilities;

import com.github.javafaker.Faker;

public class FakersFactory {
	
	public static Faker Fakers = new Faker ();

	
	public static String getEmail()
	{
		return Fakers.internet().emailAddress();
	}

}
