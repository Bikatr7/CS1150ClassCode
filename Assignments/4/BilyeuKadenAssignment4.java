/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  February 9, 2023
 *  Description: Assignment #4
 *  This program demonstrates that I probably understand how Random Numbers, Char, and Strings work by 
 *  creating a program that creates tickets for Disney World based on which theme park the 
customer wants to visit and the number of days.
 */


import java.util.*;
import java.lang.Math.*;


public class BilyeuKadenAssignment4 {
	public static void main(String[] args)
	{
		//vars
		Scanner scanner = new Scanner(System.in);
		
		char destination;
		
		int numDays;
		
		String ticket = "";
		
		final char ANIMAL_KINGDOM = 'a';
		final char EPCOT = 'e';
		final char HOLLYWOOD_STUDIOS = 'h';
		final char MAGIC_KINGDOM = 'm';
			
		// print out menu
		System.out.println("------------------------------------------");
		System.out.println("A. Animal Kingdom\nE. Epcot\nH. Hollywood Studios\nM. Magic Kingdom");
		
		// get destination
		System.out.print("\nPlease select your destination (A,E,H,M) and length of stay (1-7) : ");
		destination = scanner.next().toLowerCase().charAt(0);
	
		// if destination is valid
		if(destination == ANIMAL_KINGDOM || destination == EPCOT || destination == HOLLYWOOD_STUDIOS || destination == MAGIC_KINGDOM)
		{
			// get days
			numDays = scanner.nextInt();
			
			// if days is valid
			if(numDays < 8 && numDays > 0)
			{
				// if destination is animal kingdom
				if(destination == ANIMAL_KINGDOM)
				{
					// calculate the two random numbers
					int randomOne = (int) Math.floor(Math.random() * (99-10 + 1) + 10);
					int randomTwo = (int) Math.floor(Math.random() * (9999-1000 + 1) + 1000);
					
					ticket =  randomOne + "-" + randomTwo + "-AK";
					
					System.out.println("\nAnimal Kingdom: " + ticket + " (" + numDays + " Day Ticket)");
				}
				// if destination is epcot
				else if(destination == EPCOT)
				{
					// calculate the random number and the 2 letters
					int randomOne = (int) Math.floor(Math.random() * (99999-10000 + 1) + 10000);
					char randomTwo = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					char randomThree = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					
					ticket = randomOne + "--" + randomTwo + randomThree  + "--E";
					
					System.out.println("\nEpcot: " + ticket + " (" + numDays + " Day Ticket)");
				}
				// if destination is hollywood studios
				else if(destination == HOLLYWOOD_STUDIOS)
				{
					// calculate the three random letters and the random number
					char randomOne = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					char randomTwo = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					char randomThree = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					int randomFour = (int) Math.floor(Math.random() * (999-100 + 1) + 100);
					
					ticket = randomOne + "" + randomTwo + "" + randomThree + " " + randomFour + " HS";
					
					System.out.println("\nHollywood Studios: " + ticket + " (" + numDays + " Day Ticket)");

				}
				else // if destination is  magic kingdom
				{
					// calculate the three random letters and the random number
					int randomOne = (int) Math.floor(Math.random() * (9-1 + 1) + 1);
					char randomTwo = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					char randomThree = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					char randomFour = (char) (int) Math.floor(Math.random() * (90-69 + 1) + 69);
					
					ticket = randomOne + " " + randomTwo + "" + randomThree + "" + randomFour + " MK";
					
					System.out.println("\nMagic Kingdom: " + ticket + " (" + numDays + " Day Ticket)");
				}
				

			}
			// if days are invalid
			else 
			{
				
				System.out.println(numDays + " is a invalid number of days (1-7),  Please run program again, good bye!");
			}
		}
		// if destination is invalid
		else 
		{
			System.out.println(destination + " is a invalid destination (A,E,H,M),  Please run program again, good bye!");
		}
		
	}
}