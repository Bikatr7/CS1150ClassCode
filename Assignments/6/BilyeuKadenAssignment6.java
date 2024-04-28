/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  March 2, 2023
 *  Description: Assignment #6
 *  This program demonstrates that I probably understand how while loops and for loops work by 
 *  creating a program that uses a while loops and for loops to create a bike rental system.
 */

import java.util.*;

public class BilyeuKadenAssignment6 
{
	public static void main(String[] args)
	{
		//vars
		Scanner scanner = new Scanner(System.in);
		
		boolean isActive = true;
		
		int numAvalBikes = 9;
		int userInput = 0;
		int numBikesToRent = 0;
		int combonation = 0;
		
		int endBikeSales = 0;
		double endProfit = 0.0;
		
		double totalCost = 0.0;
		
		final double ONE_HOUR_FEE = 1.50;
		final double TWO_HOUR_FEE = 2.50;
		final double SIX_HOUR_FEE = 4.00;
		
		
		// while active loop
		while(isActive == true)
		{
			// menu output
			System.out.println("***********************************************");
			System.out.println("\n\tWelcome to UCCS Bike Share\n\t  " + numAvalBikes + " bikes are available\n");
			System.out.println("***********************************************");
			
			System.out.println("\nRental Options Fee");
			System.out.println("-------------------------------------------------");
			System.out.println("1) 1-Hour Pass $1.50\n2) 2-Hour Pass $2.50\n3) 6-Hour Pass $4.00\n4) Return ");
			System.out.println("-------------------------------------------------");
			
			System.out.print("\nSelect option (1,2,3,4) : ");
			userInput = scanner.nextInt();
			
			// if customer
			if(userInput != 999)
			{
				// while user input is invalid or bikes are out and user is not returning
				while((numAvalBikes == 0 && userInput != 4) || userInput <= 0 || userInput >= 5)
				{	
					if(numAvalBikes != 0 || userInput <= 0 || userInput >= 5)
					{
						System.out.print("\nInvalid Choice\nSelect option (1,2,3,4) : ");
						userInput = scanner.nextInt();
					}
					else
					{
						System.out.println("No bikes are avaliable for rent, please return a bike or try again later");
						System.out.print("\nInvalid Choice\nSelect option (1,2,3,4) : ");
						userInput = scanner.nextInt();
					}
					
				}
				
				// if user is not returning
				if(userInput != 4)
				{
					// prompt for num bikes
					System.out.print("\nHow many bikes would you like to rent (1-4) : ");
					numBikesToRent = scanner.nextInt();
					
					// while user input is invalid or user wants to rent more bikes then avaliable
					while(numBikesToRent <= 0 || numBikesToRent >= 5 || numBikesToRent > numAvalBikes)
					{	
						if(numBikesToRent <= numAvalBikes || numBikesToRent <= 0 || numBikesToRent >= 5)
						{
							System.out.print("\nInvalid Choice\nSelect option (1-4) : ");
							numBikesToRent = scanner.nextInt();
						}
						else
						{
							System.out.println("There is/are only " + numAvalBikes + " bike(s) available.");
							System.out.println("Request cannot be fulfilled.  Please use a different station or choose a valid amount (" + numAvalBikes + " or lower)\n");
								
							System.out.print("\nInvalid Choice\nSelect option (1-4) : ");
							numBikesToRent = scanner.nextInt();
						}

					}
					
					// add to totals and update total bikes
					numAvalBikes -= numBikesToRent;
					endBikeSales += numBikesToRent;
					
					// recipt
					System.out.println("\n-------------------------------------------------");
					System.out.println("----------------------Recipt---------------------");
					System.out.println("-------------------------------------------------\n");
					
					// calculate total and print output msg
					if(userInput == 1)
					{
						totalCost = ONE_HOUR_FEE * (double) (numBikesToRent);
						System.out.println("1-hour rental for " + numBikesToRent + " bike(s)");
					}
					else if(userInput == 2)
					{
						totalCost = TWO_HOUR_FEE * (double) (numBikesToRent);
						System.out.println("2-hour rental for " + numBikesToRent + " bike(s)");
					}
					else if(userInput == 3)
					{
						totalCost = SIX_HOUR_FEE * (double) (numBikesToRent);
						System.out.println("6-hour rental for " + numBikesToRent + " bike(s)");
					}
					
					// generate and output lock combos
					for(int i = 0; i < numBikesToRent; i++)
					{
						combonation = 10000 + (int)(Math.random() * 90000);
						
						System.out.print("\nUnlock code for bike#" + (i+1) + ": " + combonation);
					}
					
					// output ending
					System.out.printf("\n\nRental Cost: $%.2f",totalCost);
					System.out.println("\n\n-------------------------------------------------");
					System.out.println("-------------Thanks For Your Business------------");
					System.out.println("-------------------------------------------------\n");
					
					// add to totals
					endProfit += totalCost;
				}
				else // if returning
				{	
					if(numAvalBikes < 9) // if valid
					{
						System.out.println("Bike was successfully returned");
						numAvalBikes +=1;
					}
					else
					{
						System.out.println("\nStation is full.  Please use a different station\n");
					}
					
				}
			}
			else // if employee, terminate loop and print totals
			{
				System.out.println("\nBike Station at Main Hall was successfully shut down");
				System.out.println("Total Bikes Rented : " + endBikeSales);
				System.out.printf("Total Sales : $%.2f",endProfit);
				
				isActive = false;
			}
		}
				
	}
}

