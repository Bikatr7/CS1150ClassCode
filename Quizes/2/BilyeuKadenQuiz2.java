
public class BilyeuKadenQuiz2 
{
	public static void main(String [] args)
	{

			final int NUM_TURTLES = 6;
			
			int[] numbers1 = {8,1,7,19,2};
			int[] numbers2 = {6, 3, 12, 4};
			
			int largest = 0;
			int numLoggerhead = 0;
			
			double averageAge = 0.0;
				
			TurtleQ turtle1 = new TurtleQ("Hawksbill", 45, "Rose");
			TurtleQ turtle2 = new TurtleQ("Loggerhead", 62, "Pancake");
			TurtleQ turtle3 = new TurtleQ("Greenturtle", 39, "Olive");		
			TurtleQ turtle4 = new TurtleQ("Hawksbill", 33, "Miss Piggy");
			TurtleQ turtle5 = new TurtleQ("Loggerhead", 14, "B StreiSAND");
			TurtleQ turtle6 = new TurtleQ("Loggerhead", 75, "Poptart");		

			TurtleQ[] turtles = new TurtleQ[NUM_TURTLES];
			turtles[0] = turtle1;
			turtles[1] = turtle2;
			turtles[2] = turtle3;
			turtles[3] = turtle4;
			turtles[4] = turtle5;
			turtles[5] = turtle6;
			
			largest = findLargest(numbers1, numbers2);
			numLoggerhead = findNumTurtles(turtles,"Loggerhead");
			averageAge = computeAverageAge(turtles);
			
			System.out.println("Largest Value = " + largest);
			System.out.println("\nNumber of loggerhead turtles  = " + numLoggerhead);
			System.out.printf("Average age of all the turtles  = %.2f", averageAge);
			
			System.out.println("\n\nTurtles Older Than The Average Age\n---------------------------------------------------");
			System.out.printf("%-10s%-10s%-10s","Name","Age","Type");
			System.out.print("\n---------------------------------------------------");
			
			displayOlderThanAverage(turtles, averageAge);
			

	}
	
	// Find and return the largest of all values in two arrays 
	public static int findLargest (int[] array1, int[] array2) 
	{
	   int largestNum = array1[0];
	  
	   for(int i = 1; i < array1.length; i++)
	   {
		   if(array1[i] > largestNum)
		   {
			   largestNum = array1[i];
		   }
	   }
	   
	   for(int i = 0; i < array2.length; i++)
	   {
		   if(array2[i] > largestNum)
		   {
			   largestNum = array2[i];
		   }
	   }
	   
	   return largestNum;
	} 

	// Find and return the number of turtles of a specified type 
	public static int findNumTurtles (TurtleQ[] turtles, String type) 
	{
		int numType = 0;
		
	   for(int i = 0; i < turtles.length; i++)
	   {
		   if(turtles[i].getType() == type)
		   {
			   numType+=1;
		   }
	   }
	   
	   return numType;
	} 

	// Find and return the average age of all turtles 
	public static double computeAverageAge (TurtleQ[] turtles) 
	{
	   double average = 0.0;
	   
	   for(int i =0; i < turtles.length; i++)
	   {
		   average += (double) turtles[i].getAge();
	   }
	   
	   average = average / (double) turtles.length;
	   
	   return average;
	} 

	// Display name, age, type of all turtles that are older than incoming average age 
	public static void displayOlderThanAverage(TurtleQ[] turtles, double averageAge) 
	{
		for(int i = 0; i < turtles.length; i++)
		{
			if((double) turtles[i].getAge() > averageAge)
			{
				System.out.printf("\n%-10s%-10s%-10s",turtles[i].getName(),turtles[i].getAge(),turtles[i].getType());
			}
		}

	} 
	
}

class TurtleQ 

{
	private String type;  
	private int age;
	private String name;
	
	public TurtleQ (String type, int age, String name) 
	{
	   this.name = name;
	   this.age = age;
	   this.type = type;
	}
		
	public String getType() 
	{
	   return type;
	}

	public int getAge() 
	{
	   return age;
	}

	public String getName() 
	{
	   return name;
	}

} // TurtleQ