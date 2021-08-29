package com.greatlearning.service;
import java.util.Scanner ;

import com.greatlearning.model.Employee;

public class DriverClass 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String firstName , lastName , department = "default";
		CredentialService cs = new CredentialService();
		String generatedEmail ;
		char[] generatedPassword ;
		
		System.out.println("Enter the Employee first Name");		
		firstName = scan.nextLine();	
		
		System.out.println("Enter the Employee last Name");
		lastName  = scan.nextLine();
		
		
		Employee emp = new Employee(firstName,lastName);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		int nOption = scan.nextInt();
		
		switch(nOption)
		{  
		    //Case statements  
		   case 1: department = "tech";  
		   break;  
		   case 2: department = "adm";  
		   break;  
		   case 3: department = "hr";  
	       break;  
		   case 4: department = "lg"; 
	       break; 
		    //Default case statement  
		   default:System.out.println("Please Enter the correct option from 1 to 4");  
		}
		
		if(department.equals("default"))
		{
			System.out.println("Credentials generation failed because of Incorrect department");
		}
		else
		{
			generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), department);
			generatedPassword = cs.generatePassword() ;
			cs.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		scan.close(); // To prevent memory leak 
		

	}

}
