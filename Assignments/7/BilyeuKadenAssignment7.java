/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  March 9, 2023
 *  Description: Assignment #7
 *  This program demonstrates that I probably understand how methods work by 
 *  creating a program that uses multiple functions to help a user perform several health checks
 */

import java.util.*;

public class BilyeuKadenAssignment7
{
	public static void main(String[] args)
	{
		// vars
		Scanner scanner = new Scanner(System.in);
		
		int typeCheck;
		int bpTopNumber;
		int bpBottomNumber;
		int chol;
		
		double bmiResult;
		
		String hcResult = "";
		
		final int EXIT = 4;
		
		// gets inital healthCheck type
		typeCheck = getHealthCheck(scanner);
		
		// while user doesn't want to exit
		while(typeCheck != EXIT)
		{
			// gets bmi result
			if(typeCheck == 1)
			{	
				bmiResult = computeBMI(scanner);
				
				hcResult = checkBMI(bmiResult);
				
			}
			// gets bp result
			else if(typeCheck == 2) 
			{
				System.out.print("Please enter the top number on your blood pressure monitor : ");
				bpTopNumber = scanner.nextInt();
				
				System.out.print("Please enter the bottom number on your blood pressure monitor : ");
				bpBottomNumber = scanner.nextInt();
				
				hcResult = checkBloodPressure(bpTopNumber,bpBottomNumber);
			}
			// gets cholosterel result
			else if(typeCheck == 3)
			{
				System.out.print("Please enter your cholesterol  : ");
				chol = scanner.nextInt();
				
				hcResult = checkCholesterol(chol); 
			}
			// displays results
			if(typeCheck != 4)
			{
				displayResults(typeCheck, hcResult);
				typeCheck = getHealthCheck(scanner);
			}
			// prints exit msg
			else
			{
				System.out.println("Have a healthy day!  Goodbye");
			}
			

		}
		
		
		
	}


	// prompts user for type of health check and returns valid type
	public static int getHealthCheck(Scanner scanner)
	{
		int nput = 0;
		
		System.out.println("Option	Health Check");
		System.out.println("--------------------");
		System.out.println("1		BMI");
		System.out.println("2		Blood Pressure");
		System.out.println("3		Cholesterol");
		System.out.println("4		Exit");
		
		System.out.print("\nSelect option (1,2,3,4) : ");
		
		nput = scanner.nextInt();
		
		while(nput < 1 || nput > 4)
		{
			
			System.out.print("\nInvalid Input\nSelect option (1,2,3,4) : ");
			nput = scanner.nextInt();
		}
	
		return nput;
	}
	
	
	// gets double value of bmi and returns it
	public static double computeBMI(Scanner scanner)
	{
		int weight;
		int heightFeet;
		int heightInches;
		
		double bmi;
		
		System.out.print("\nPlease enter weight in pounds : ");
		weight = scanner.nextInt();
		
		System.out.print("Please enter height in feet : ");
		heightFeet = scanner.nextInt();
		
		System.out.print("Please enter height in inches : ");
		heightInches = scanner.nextInt();
		
		heightInches += heightFeet * 12;
		
		bmi = 703.0 * ((float) weight/ ((float)heightInches * (float)heightInches));
		
		return bmi;
	}
	
	// returns bmiresult string based off of bmi result from computeBMI
	public static String checkBMI(double bmi)
	{
		
		String bmiRating;
				
		if(bmi < 18.5)
		{
			bmiRating = "Underweight";
		}
		else if(bmi > 25.0)
		{
			bmiRating = "Overweight";
		}
		else
		{
			bmiRating = "Normal";
		}
		
		return bmiRating;
	}
	
	// returns choleseterol based of number given by user
	public static String checkCholesterol(int cholesterol) 
	{
		String cholRating;
		
		if(cholesterol < 200)
		{
			cholRating = "Good";
		}
		else if(cholesterol > 239)
		{
			cholRating = "High";
		}
		else
		{
			cholRating = "Elevated";
		}
		
		return cholRating;
	}
	
	// returns blood pressure rating based of 2 numbers provided by user
	public static String checkBloodPressure(int topNumber, int bottomNumber)
	{
		String bpRating;
		
		if(topNumber <= 120 && bottomNumber <= 80)
		{
			bpRating = "Normal";
		}
		else if(topNumber >= 121 && topNumber <= 129 && bottomNumber <= 80)
		{
			bpRating = "Elevated";
		}
		else if(topNumber >= 130 && topNumber <= 139 && bottomNumber >= 80 && bottomNumber <= 89)
		{
			bpRating = "Stage 1 High Blood Pressure";
		}
		else
		{
			bpRating = "Stage 2 High Blood Pressure";
		}
		
		return bpRating;
	}
	
	
	// displays formatted result based of health check type and result from the corrospeonding health check function
	public static void displayResults(int healthCheck, String healthCheckResult)
	{
		String output = "\n***************************************\n";
		
		switch(healthCheck) 
		{
		  case 1:
			  output += "BMI Result = ";
			  break;
		  case 2:
			  output += "Cholesterol Result = ";
			  break;
		  case 3:
			  output += "Blood Pressure Result = ";
			  break;
			  
		}
		
		output +=  healthCheckResult + "\n***************************************\n";
		
		System.out.println(output);

	}

}