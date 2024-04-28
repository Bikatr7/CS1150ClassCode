/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  April 27, 2023
 *  Description: Assignment #12
 *  This program demonstrates that I probably understand how polymorphism and superclasses work by writing a program using file I/O to read in animals through a file
 */

import java.io.*;
import java.util.*;

public class BilyeuKadenAssignment12{

	public static void main(String[] args) throws IOException
	{
	
		// TODO Auto-generated method stub

		// Setup the file reference variable to refer to the text file
		File inputFileName = new File("Animals.txt");

		// Open the file for reading by creating a scanner for the file
		Scanner inputFile = new Scanner(inputFileName);

		int numOfAnimals = inputFile.nextInt();
		Animal[] animals = new Animal[numOfAnimals];

		for (int i = 0; i < numOfAnimals; i++) {
			String type = inputFile.next();
			String name = inputFile.next();
			String food = inputFile.next();
			int weight = inputFile.nextInt();
			int sleep = inputFile.nextInt();
			String location = inputFile.nextLine();
			
			System.out.println(type);

			if (type.equals("Bear")) {
				animals[i] = new Bear(name, food, weight, sleep, location);
			}
			else if (type.equals("Elephant")) {
				animals[i] = new Elephant(name, food, weight, sleep, location);
			}
			else if (type.equals("Monkey")) {
				animals[i] = new Monkey(name, food, weight, sleep, location);
			}
			else if (type.equals("Sloth")) {
				animals[i] = new Sloth(name, food, weight, sleep, location);
			}
		}   
		
		System.out.println(animals[1]);

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Bear) {
				System.out.println("Animal[" + i + "] is a Bear");
			} else if (animals[i] instanceof Elephant) {
				System.out.println("Animal[" + i + "] is an Elephant");
			} else if (animals[i] instanceof Monkey) {
				System.out.println("Animal[" + i + "] is a Monkey");
			} else if (animals[i] instanceof Sloth) {
				System.out.println("Animal[" + i + "] is a Sloth");
			}
			System.out.println(animals[i].toString());
			animals[i].eat();
			animals[i].sleep();
			animals[i].swim();
            System.out.println();
        }




		}
	}
	//Animal Class
	class Animal{
		private String name;
		private String food;
		private int weight;
		private int sleep;
		private String location;	

		public Animal(String name, String food, int weight, int sleep, String location) {
			this.name = name;
			this.food = food;
			this.weight = weight;
			this.sleep = sleep;
			this.location = location;
		}
		public String getName() {
			return name;
		}
		public String getFood() {
			return food;
		}
		public int getWeight() {
			return weight;
		}
		public int getSleep() {
			return sleep;
		}
		public String getLocation() {
			return location;
		}

		public void eat() {
			System.out.println("Animal is eating");

		}

		public void sleep() {
			System.out.println("Animal is sleeping");
		}

		public void swim() {
			System.out.println("Animal is swimming");

		}

		public String toString() {
			return "Name: " + name + "- Weighs: "+ weight + " lbs - Sleeps: " + sleep + "hrs - Location: " + location;
		}



	}//Animal Class ends

	//Bear Class
	class Bear extends Animal{
		public Bear(String name, String food, int weight, int sleep, String location) {
			super (name, food, weight, sleep, location);
		}
		@Override
		public void eat() {
			System.out.println(getName()+ " is eating " + getFood() + " .");
		}
		@Override
		public void sleep() {
			System.out.println(getName()+ " is sleeping " + getSleep() + " hrs.");
		}
		@Override
		public void swim() {
			System.out.println(getName()+ " is swimming.");
		}
	}//Bear Class ends

	//Elephant class
	class Elephant extends Animal{
		public Elephant(String name, String food, int weight, int sleep, String location) {
			super (name, food, weight, sleep, location);

		}

		@Override
		public void sleep() {
			System.out.println(getName()+ " is sleeping " + getSleep() + " hrs.");
		}
	}//Elephant Class ends

	//Monkey Class
	class Monkey extends Animal{
		public Monkey(String name, String food, int weight, int sleep, String location) {
			super (name, food, weight, sleep, location);
		}
		@Override
		public void eat() {
			System.out.println(getName()+ " is eating " + getFood() + " .");
		}
		@Override
		public void swim() {
			System.out.println(getName()+ " is swimming.");
		}
	}//Monkey Class ends

	//Sloth Class
	class Sloth extends Animal{
		public Sloth(String name, String food, int weight, int sleep, String location) {
			super (name, food, weight, sleep, location);
		}
	}//Sloth Class ends

