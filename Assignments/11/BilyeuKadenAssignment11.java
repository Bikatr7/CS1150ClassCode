/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  April 20, 2023
 *  Description: Assignment #11
 *  This program demonstrates that I probably understand how arrays, objects, classes, and class structures work  by 
 *  creating a program that uses multiple classes and functions to create a racecar simulator
 */

//impotys
import java.util.*;
import java.lang.Math;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class BilyeuKadenAssignment11
{
	public static void main(String[] args) throws IOException
	{
		//vars
		RaceCar [] racecars = new RaceCar[6];
		
		boolean raceActive = true;
		
		double time = 0.25;
		
		// creates cars
		createRaceCars(racecars);
		
		// output
		System.out.println("Race cars at start of race");
		System.out.println("---------------------------------------------------------");
		System.out.printf("%-10s%-10s%-10s%-7s%n", "Race Car", "Driver", "Average", "Miles");
		System.out.printf("%-10s%-10s%-10s%-7s%n", "Number", "", "Speed", "Raced");
		System.out.println("---------------------------------------------------------");
		
		// shows cars
		displayAllRaceCars(racecars);
		
		System.out.print("\nAll cars are ready - let the race begin in 5..4..3..2..1\n");
		
		// start race
		while(!isRaceFinished(racecars))
		{
			System.out.print("Racing Time ... " + time + " hours\n");
			
			if(time % 1.0 == 0)
			{
				for(int i =0; i < racecars.length;i++)
				{
					if(racecars[i].isFinished() == false)
					{
						// update miles
						racecars[i].getOdometer().updateMiles(racecars[i].getAverageSpeed());
						
						// if finished, set flag
						if(racecars[i].getOdometer().getMiles() >= 500.00)
						{
							racecars[i].setFinished(true);
							displayRaceCar(racecars[i]);

						}
					}
				}
			}
			
			time += .25;
		}
		
		// display
		System.out.println("\nRace cars at end of race");
		System.out.println("---------------------------------------------------------");
		System.out.printf("%-10s%-10s%-10s%-7s%n", "Race Car", "Driver", "Average", "Miles");
		System.out.printf("%-10s%-10s%-10s%-7s%n", "Number", "", "Speed", "Raced");
		System.out.println("---------------------------------------------------------\n");
		
		displayAllRaceCars(racecars);
		
		// write to file
		writeRaceCarDetailsToFile(racecars);

		
	}
	
	// Create the race cars for the race based on the assignment sheet table and
	// fill the incoming array with the race cars
	public static void createRaceCars(RaceCar[] raceCars)
	{
		raceCars[0] = new RaceCar("Donkey",8,80.0);
		raceCars[1] = new RaceCar("Shrek",11,115.0);
		raceCars[2] = new RaceCar("Dragon",17,70.0);
		raceCars[3] = new RaceCar("Fiona",18,100.0);
		raceCars[4] = new RaceCar("Farquaad",45,84.0);
		raceCars[5] = new RaceCar("Pinocchio",42,68.0);
	
	}
	
	// Display the details (driver’s name and miles raced) for a single race car
	public static void displayRaceCar(RaceCar raceCar)
	{
		System.out.println("Finished : " + raceCar.getDriver() + " with "  + raceCar.getOdometer().getMiles() + " miles");
	}
	
	// Display the details for each race car in the array
	// Display race car #, driver name, average speed, and miles raced
	public static void displayAllRaceCars(RaceCar[] raceCars) 
	{
		for(int i = 0; i < raceCars.length; i++)
		{
			System.out.printf("%-10s%-10s%-10s%-7s%n", raceCars[i].getNumber(), raceCars[i].getDriver(), raceCars[i].getAverageSpeed(), raceCars[i].getOdometer().getMiles());
			
		}
	}
	
	// Determines if the race is finished, that is, have all race cars finished
	// If "finished" state for all race cars is true, return true otherwise false
	public static boolean isRaceFinished(RaceCar[] raceCars)
	{
		for(int i = 0; i< raceCars.length; i++)
		{
			if(raceCars[i].isFinished() == false)
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
	// Print the details for each race car in the race cars array to a file
	public static void writeRaceCarDetailsToFile(RaceCar[] raceCars) throws IOException
	{
		
		File fileName = new File("Assignment11.txt");
		PrintWriter resultsFile = new PrintWriter (fileName);
		
		resultsFile.println("Race Car Details\n");
		
		for (int i = 0; i < raceCars.length; i ++)
		{
			
		resultsFile.println("Race Car #: " + raceCars[i].getNumber());
		resultsFile.println("Driver: " + raceCars[i].getDriver());
		resultsFile.println("Miles: " + raceCars[i].getOdometer().getMiles());
		
		resultsFile.println();
		resultsFile.println();
		
		}

		resultsFile.close();

		System.out.println("\nFind the file here " + fileName.getAbsolutePath());
		System.out.println();
		
	}

}

class RaceCar
{
	//vars
	private String driver;
	private int number;
	private double averageSpeed;
	private boolean finished;
	private Odometer odometer;
	
	// constructor
	public RaceCar(String driver, int number, double averageSpeed)
	{
		this.driver = driver;
		this.number = number;
		this.averageSpeed = averageSpeed;
		
		finished = false;
		
		odometer = new Odometer();
	}
	
	// getters
	public String getDriver()
	{
		return driver;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public double getAverageSpeed()
	{
		return averageSpeed;
	}
	
	public boolean isFinished()
	{
		return finished;
	}
	
	public Odometer getOdometer()
	{
		return odometer;
	}
	
	// setter
	public void setFinished(boolean finished)
	{
		this.finished = finished;
	}
	
	
}

class Odometer
{
	//vars
	private double miles;
	
	//constructor
	public Odometer()
	{
		miles = 0;
	}
	
	// getter
	public double getMiles()
	{
		return miles;
	}
	
	// setter?
	public void updateMiles(double milesTraveled)
	{
		miles += milesTraveled;
	}
}