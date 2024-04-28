/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  April 13, 2023
 *  Description: Assignment #10
 *  This program demonstrates that I probably understand how arrays, objects, and classes  by 
 *  creating a program that uses multiple functions to perform various manipulations on several arrays, classes, and objects.
 */

import java.util.*;
import java.lang.Math;

public class BilyeuKadenAssignment10 
{
	public static void main(String[] args)
	{
		// vars
		Turtle turtle1 = new Turtle("Hawksbill", 42, "Rose");
		Turtle turtle2 = new Turtle("Leatherback", 30, "Donna");
		Turtle turtle3 = new Turtle("Loggerhead", 62, "Pancake");
		Turtle turtle4 = new Turtle("Greenturtle", 39, "Olive");
		Turtle turtle5 = new Turtle("Loggerhead", 75, "Poptart");
		Turtle turtle6 = new Turtle("Hawksbill", 33, "Miss Piggy");
		Turtle turtle7 = new Turtle("Leatherback", 14, "B StreiSAND");
		
		Turtle turtle8 = new Turtle("Greenturtle", 150, "Crush");
		Turtle turtle9 = new Turtle("Leatherback", 18, "Myrtle");
		Turtle turtle10 = new Turtle("Hawksbill", 44, "Coco");

		
		Turtle[] turtleArray = new Turtle[7];
		
		turtleArray[0] = turtle1;
		turtleArray[1] = turtle2;
		turtleArray[2] = turtle3;
		turtleArray[3] = turtle4;
		turtleArray[4] = turtle5;
		turtleArray[5] = turtle6;
		turtleArray[6] = turtle7;
				
		TurtleHospital turtleHospital = new TurtleHospital("Key West Turtle Rescue", 9);
		
		int oldestIndex = 0;
		
		// start main manipulations
		System.out.println("********************************************");
		System.out.println("Part 1: Turtles In Array in Main");
		System.out.println("********************************************\n");
		
		System.out.println("------------------------------------");
		System.out.printf("%-13s%-8s%s%n", "Type", "Age", "Name");
		System.out.println("------------------------------------\n");
		
		// display formatted turtle list
		for(int i = 0; i < turtleArray.length; i++)
		{
			System.out.printf("%-13s%-8s%s%n", turtleArray[i].getType(), turtleArray[i].getAge(), turtleArray[i].getName());

		}
		
		System.out.println("\n------------------------------------");
		System.out.println("Oldest turtle in the array of turtles");
		System.out.println("------------------------------------\n");
		
		// gets and display oldest turtle
		for(int i = 1; i < turtleArray.length; i++)
		{
			if(turtleArray[i].getAge() > turtleArray[oldestIndex].getAge())
			{
				oldestIndex = i;
			}
		}
		
		// display
		System.out.println("Type : " + turtleArray[oldestIndex].getType());
		System.out.println("Age : " + turtleArray[oldestIndex].getAge());
		System.out.println("Name : " + turtleArray[oldestIndex].getName());
		
		System.out.println("\n********************************************");
		System.out.println("Part 2: Turtles In Turtle Hospital");
		System.out.println("********************************************\n");
		
		// add existing turtles to hospital
		for(int i = 0; i < turtleArray.length; i++)
		{
			System.out.println("Was " + turtleArray[i].getName() + " added? " + turtleHospital.addTurtle(turtleArray[i]));
		}
		
		// add new turtles as well
		System.out.println("Was " + turtle8.getName() + " added? " + turtleHospital.addTurtle(turtle8));
		System.out.println("Was " + turtle9.getName() + " added? " + turtleHospital.addTurtle(turtle9));
		System.out.println("Was " + turtle10.getName() + " added? " + turtleHospital.addTurtle(turtle10));
		
		System.out.println("\n------------------------------------");
		System.out.printf("%-13s%-8s%s%n", "Type", "Age", "Name");
		System.out.println("------------------------------------\n");
		
		// display turtles
		turtleHospital.displayTurtles();
		
		System.out.println("\n------------------------------------");
		System.out.println("Oldest turtle in the array of turtles");
		System.out.println("------------------------------------\n");
		
		// get and display oldest turtle and hospital name
		Turtle oldTurtle = turtleHospital.findOldestTurtle();
		
		System.out.println("Turtle Hospital : " + turtleHospital.getHospitalName());
		System.out.println("Type : " + oldTurtle.getType());
		System.out.println("Age : " + oldTurtle.getAge());
		System.out.println("Name : " + oldTurtle.getName());
	}

}

// turtle class
class Turtle
{
	//vars
	private String type;
	private int age;
	private String name;
	
	// constructor
	public Turtle(String type, int age, String name)
	{
		this.type = type;
		this.age = age;
		this.name = name;
				
	}
	
	//"getters"
	public String getType()
	{
		return this.type;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{ 
		return this.name;
	}
}

// turtle hospital class
class TurtleHospital
{
	// vars
	private String hospitalName;
	private Turtle[] turtles;
	private int numTurtlesInHospital;
	
	// constructor
	public TurtleHospital(String hospitalName, int maxNumTurtles)
	{
		this.hospitalName = hospitalName;
		this.turtles = new Turtle[maxNumTurtles];
		this.numTurtlesInHospital = 0;
	}
	
	// getters
	public String getHospitalName()
	{
		return this.hospitalName;
	}
	
	// adds turtles
	public boolean addTurtle(Turtle turtleToAdd)
	{
		if(this.turtles.length > this.numTurtlesInHospital)
		{
	        this.turtles[this.numTurtlesInHospital] = turtleToAdd;
	        this.numTurtlesInHospital++;
	        return true;
	    }
	    else
	    {
	        return false;
		}
	}
	
	// gets and returns oldest turtles
	public Turtle findOldestTurtle()
	{
		int oldestIndex = 0;
		for(int i = 1; i < this.numTurtlesInHospital; i++)
		{
			if(this.turtles[i].getAge() > this.turtles[oldestIndex].getAge())
			{
				oldestIndex = i;
			}
			
		}
		
		return this.turtles[oldestIndex];
	}
	// displays turtles
	public void displayTurtles()
	{
		for(int i = 0; i < this.numTurtlesInHospital; i++)
		{
			System.out.printf("%-13s%-8s%s%n", this.turtles[i].getType(), this.turtles[i].getAge(), this.turtles[i].getName());
		}
	}

}