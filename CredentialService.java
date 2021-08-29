package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService 
{
	public char[] generatePassword()
	{
		char[] password = new char[8] ;
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()_+-<>?=" ;
	//	String values = capitalLetters + smallLetters + numbers + specialCharacters ;
		
		Random random = new Random();
		int nPassCount = 0 ; // The length of password initialized to 0 . Eventually it will have 8 as length
		for (int i= 0 ; i < 2 ; i++)
		{
			password[nPassCount++] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
			password[nPassCount++] = smallLetters.charAt(random.nextInt(smallLetters.length()));
			password[nPassCount++] = numbers.charAt(random.nextInt(numbers.length()));
			password[nPassCount++] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
			
		}
		
		
		// The below logic has the possibility of not using all small , caps, numbers and special chars
		// to form password .Hence its not used 
/*		
		for( int i = 0 ; i < password.length ; i++ )
		{
			password[i] = values.charAt(random.nextInt(values.length())) ;
		}
*/		
		return password ;
		
	}
	public String generateEmailAddress(String firstName , String lastName , String department)
	{
		
		return firstName + lastName + "@" + department + "." + "abc.com";
	}
	
	public void showCredentials(Employee employee , String email , char[] generatedPassword)
	{
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email --> " + email);
		System.out.print("Password --> ");
		System.out.println(generatedPassword);
		
	}

}
