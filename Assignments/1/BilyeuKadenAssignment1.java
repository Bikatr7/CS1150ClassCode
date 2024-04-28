/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  January 26, 2023
 *  Description: Assignment #1 
 *  This program demonstrates that I probably understand basic program structure by 
 *  printing a couple paragraphs that tell the instructor what I’m passionate       
 *  about.  It also gives a little practice with arithmetic in Java.
 */

public class BilyeuKadenAssignment1 {
	public static void main(String[] args)
	{
		System.out.println("  My name is Kaden Bilyeu");
		System.out.println("I am working on my Computer Science degree");
		System.out.println("It's the B.I. Not the B.S.");
		System.out.println("I have multiples hobbies.");
		System.out.println("I like to read.");
		System.out.println("I like to program.");
		System.out.println("I like to study japanese.");
		System.out.println("");
		System.out.println("I haven't really traveled anywhere before.");
		System.out.println("However, I would like to travel to Japan eventually.");
		System.out.println("I have some knowledge in programming.");
		System.out.println("I have actually taken this class before in HS.");
		System.out.println("However, It was taught in Python.");
		System.out.println("Regardless of that, I still look foward to this class.\n\n");
		
		final int first = 1;
		final int second = 5;
		final int third = 100;
		final int fourth = 150;
		
		double first_moon = (first * 1.622) / 9.81;
		double second_moon = (second * 1.622) / 9.81;
		double third_moon = (third* 1.622) / 9.81;
		double fourth_moon = (fourth * 1.622) / 9.81;

		double first_mars = (first * 3.711) / 9.81;
		double second_mars = (second * 3.711) / 9.81;
		double third_mars = (third* 3.711) / 9.81;
		double fourth_mars = (fourth * 3.711) / 9.81;
		
		System.out.println("Earth  Moon 		   Mars");
		System.out.println("--------------------------------------------------");
		System.out.println(first + "      " + first_moon + "  " + first_mars);
		System.out.println(second + "      " + second_moon + "  " + second_mars);
		System.out.println(third + "    " + third_moon + "   " + third_mars);
		System.out.println(fourth + "    " + fourth_moon + "  " + fourth_mars);
		
		
		
	}
}
