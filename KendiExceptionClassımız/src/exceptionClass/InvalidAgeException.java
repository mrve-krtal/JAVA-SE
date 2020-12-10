package exceptionClass;

import java.io.IOException;

public class InvalidAgeException extends IOException {

	@Override
	public void printStackTrace() {
		
		System.out.println("Bu bir invalid age hatasıdır..");
	}

}
