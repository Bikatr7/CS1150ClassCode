
import java.util.*;

public class BilyeuKadenQuiz1 {
	public static void main(String [] args)
	{
		int numDays;
		int finalCost;
		
		char carCompany;
		
		String carCompanyName;
		
		Scanner scanner = new Scanner(System.in);
		
		final int TIER_ONE_COST = 65;
		final int TIER_TWO_COST = 55;
		final int TIER_THREE_COST = 50;
		final int TIER_FOUR_COST = 40;
		
		System.out.print("A: AVIS\nB: Budget\nH: Hertz\nN: National\n\nPlease enter the car rental company you would like to rent from (A,B,H,N) : ");
		carCompany = scanner.next().toLowerCase().charAt(0);
		
		if(carCompany == 'a' || carCompany == 'b' || carCompany == 'h' || carCompany == 'n')
		{
			if(carCompany == 'a')
			{
				carCompanyName ="Avis";
			}
			else if(carCompany == 'b')
			{
				carCompanyName = "Budget";
			}
			else if(carCompany == 'h')
			{
				carCompanyName = "Hertz";
			}
			else
			{
				carCompanyName = "National";
			}
			
			System.out.print("\nYou selected " + carCompanyName);
			
			System.out.print("\n\nPlease enter the number of days you want to rent the car (1-30) : ");
			numDays = scanner.nextInt();
			
			if(numDays >= 1 && numDays <= 30)
			{
				if(numDays < 8)
				{
					finalCost = numDays * TIER_ONE_COST;
					System.out.print("At $" + TIER_ONE_COST + " per day, your rental car costs $" + finalCost);
				}
				else if(numDays > 7 && numDays < 15)
				{
					finalCost = numDays * TIER_TWO_COST;
					System.out.print("At $" + TIER_TWO_COST + " per day, your rental car costs $" + finalCost);
				}
				else if(numDays > 14 && numDays < 26)
				{
					finalCost = numDays * TIER_THREE_COST;
					System.out.print("At $" + TIER_THREE_COST + " per day, your rental car costs $" + finalCost);
				}
				else
				{
					finalCost = numDays * TIER_FOUR_COST;
					System.out.print("At $" + TIER_FOUR_COST + " per day, your rental car costs $" + finalCost);
				}
				
			}
			else
			{
				System.out.println("Invalid number of days - good bye");
			}
		}
		else
		{
			System.out.println("Invalid car rental company - good bye");
		}

	}

}
