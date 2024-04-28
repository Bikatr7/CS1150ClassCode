/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  February 20, 2023
 *  Description: Assignment #5
 *  This program demonstrates that I probably understand how while loops work by 
 *  creating a program that uses a while loop to create a "simple" lottery ticket game.
 */


import java.util.*;

public class BilyeuKadenAssignment5 {
	public static void main(String[] args)
	{
		//vars
		int numTickets = 0;
		int numWinningTickets = 0;
		
		double chanceOfWin = 0.0;

		Scanner scanner = new Scanner(System.in);
		
		// get initial ticket number
		System.out.print("Happy Go Lucky Scratch Ticket Game\nPlease enter the amount of tickets you would like to by (1-15)\n");
		numTickets = scanner.nextInt();
		
		// if invalid, reprompt till valid
		while(numTickets < 1 || numTickets > 15)
		{
			System.out.print(numTickets + "is not a valid input, please reenter\nPlease enter the amount of tickets you would like to by (1-15)\n");
			numTickets = scanner.nextInt();
		}
		
		// prompt outer display
		System.out.println("\nGenerating Scratch Tickets...and the results are!\n\nTicket	Outcome	Winning # Scatch Ticket Numbers");
		System.out.println("-----------------------------------------------");
		
		// for loop for outputting ticket results
		for(int i = 0; i < numTickets; i++)
		{
			int winner = (int) (Math.random() * (30 - 1)) + 1;
			
			int scratch1 = (int) (Math.random() * (30 - 1)) + 1;
			int scratch2 = (int) (Math.random() * (30 - 1)) + 1;
			int scratch3 = (int) (Math.random() * (30 - 1)) + 1;
			
			String result = "Loser";
			
			// check if ticket is a winner, if so, increase num winning tickets
			if(winner == scratch1 || winner == scratch2 || winner == scratch3)
			{
				result = "Winner";
				numWinningTickets++;
				
			}
			// output ticket results
			System.out.printf("%d 	%s 	%d 	  %d     %d     %d\n",i+1,result,winner,scratch1,scratch2,scratch3);
			

		}
		// calculate probability
		chanceOfWin = (double) numWinningTickets / (double) numTickets * 100;
		
		// output results
		System.out.println("\nNumber of Scratch Tickets : " + numTickets);
		System.out.println("Number of Winning Tickets : " + numWinningTickets);
		System.out.println("Probability of Winning : " + chanceOfWin + "%");
	}
}

