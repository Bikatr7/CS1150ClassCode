/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  February 4, 2023
 *  Description: Assignment #3
 *  This program demonstrates that I probably understand how boolean expressions, relational
 *  and logical operators, and if-statements work by 
 *  creating a simple rental car reservation program.
 */
import java.util.*;

// class and main
public class BilyeuKadenAssignment3 {
	public static void main(String[] args)
	{
		//vars
		Scanner scanner = new Scanner(System.in);
		
		int typeOfCar = 0;
		int numRentalDays = 0;
		
		String carType = "";
		
		final double ECONOMY_FEE = 62.00;
		final double COMPACT_FEE = 75.00;
		final double STANDARD_FEE = 83.00;
		final double LUXURY_FEE = 118.00;
		
		final double TAX_RATE = 11.25/100;
		final double SAFETY_RATE = 2.50;
		
		double dayCost = 0.0;
		double safetyFee = 0.0;
		double taxCost = 0.0;
		double totalCost = 0.0;
		
		//menu output
		System.out.println("Option\t Car Type\t Daily Rental Rate");
		System.out.println("------------------------------------------");
		System.out.printf("1\t Economy\t $%.2f",ECONOMY_FEE);
		System.out.printf("\n2\t Compact\t $%.2f",COMPACT_FEE);
		System.out.printf("\n3\t Standard\t $%.2f",STANDARD_FEE);
		System.out.printf("\n4\t Luxury  \t $%.2f",LUXURY_FEE);
		System.out.println("\n------------------------------------------");
		
		// grab type of car
		System.out.print("\nPlease select the type of car you would like to rent. (1-4) : ");
		typeOfCar = scanner.nextInt();
		
		// type of car input check
		if(typeOfCar < 1 || typeOfCar > 4)
		{
			System.out.println(typeOfCar + " is not a valid car type.  Please run program again, good bye!");
		}
		else
		{	// grab number of days for car rental
			System.out.print("\nPlease select the number of days you would like to rent the car. (1-20) : ");
			numRentalDays = scanner.nextInt();
			
			// numRentalDays input check
			if(numRentalDays < 1 || numRentalDays > 20)
			{
				System.out.println(numRentalDays + " is not a valid number of rental days.  Please run program again, good bye!");
			}
			
			else 
			{
				// determine type of car as well as day cost
				if(typeOfCar == 1)
				{
					carType = "Economy";
					dayCost = (double) numRentalDays * ECONOMY_FEE;
				}
				else if(typeOfCar == 2)
				{
					carType = "Compact";
					dayCost = (double) numRentalDays * COMPACT_FEE;
				}
				else if(typeOfCar == 3)
				{
					carType = "Standard";
					dayCost = (double) numRentalDays * STANDARD_FEE;
				}
				else
				{
					carType = "Luxury";
					dayCost = (double) numRentalDays * LUXURY_FEE;
				}
				
				// calculate safety fee and taxes
				safetyFee = (double) numRentalDays * SAFETY_RATE;
				taxCost = (dayCost + safetyFee) * TAX_RATE;
				totalCost = dayCost + taxCost + safetyFee;
				
				// output results
				System.out.println("\n\n---------------------------");
				System.out.println("Car Type  : \t" + carType);
				System.out.printf("%d Days    : \t%.2f",numRentalDays,dayCost);
				System.out.printf("\nFees      : \t%.2f",safetyFee);
				System.out.printf("\nTaxes     : \t%.2f",taxCost);
				System.out.println("\n---------------------------");
				System.out.printf("Total     : \t%.2f",totalCost);
				System.out.println("\n---------------------------");
			
				
			}
				
			
		}

		
	}
}
