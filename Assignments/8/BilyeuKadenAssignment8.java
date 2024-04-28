
public class BilyeuKadenAssignment8 {
	public static void main(String[] args)
	{
		// vars
		Dog[] dogArray = new Dog[5];
				
		int[] numbers = {10, 3, 8, 6, 1, 7, 2};
		int[] highValues;
		
		int sumOfEvenValues;
		int sumConsecValues;
		
		// creating dogs and assigning to array 
		Dog dog1 = new Dog("Rover", "woof woof");
		Dog dog2 = new Dog("Max", "arf arf arf");
		Dog dog3 = new Dog("Tiny", "yap yap yap");
		Dog dog4 = new Dog("Trooper", "ruff ruff ruff");
		Dog dog5 = new Dog("Magoo", "bow wow bow wow");
		
		dogArray[0] = dog1;
		dogArray[1] = dog2;
		dogArray[2] = dog3;
		dogArray[3] = dog4;
		dogArray[4] = dog5;
		
		// get and output array
		System.out.print("Individual values\n-----------------------------\n");
		
		display(numbers);
		
		// get and display sum of even values
		System.out.print("\n\nSum of even values\n-----------------------------\n");
		
		sumOfEvenValues = computeSumOfEvenValues(numbers);
		
		System.out.print("Even Sum : " + sumOfEvenValues);
		
		// get and display sum of each consecutive pair
		System.out.print("\n\n\nSum of each consecutive pair:\n-----------------------------\n");
		
		displaySumOfEachConsecutivePair(numbers);
		
		// get and display sum of all consecutive pairs
		System.out.print("\n\n\nSum of all consecutive pairs\n-----------------------------\n");
		
		sumConsecValues = computeSumOfAllConsecutivePairs(numbers);
		
		System.out.println(sumConsecValues);
		
		// get and display sum of all possible pairs
		System.out.print("\n\n\nSum of all possible pairs:\n-----------------------------\n");
		
		displaySumOfAllPairs(numbers);
		
		// get and display the largest values in the array
		System.out.print("\n\n\nTwo largest values:\n-----------------------------\n");
		
		highValues = findTwoLargestValues(numbers);
		
		System.out.print("The two largest values in the array are " + highValues[0] + " and " + highValues[1]);
		
		// make the dogs bark
		System.out.print("\n\n\nMaking the dogs bark!\n-----------------------------\n");
		
		makeDogsBark(dogArray);
		
	}

	// Displays all values in the array
	public static void display(int[] numbers)
	{
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("numbers[" + i + "] = " + numbers[i]);
			
		}
	}
	// get and display sum of all consecutive pairs
	public static int computeSumOfEvenValues(int[] numbers)
	{
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] % 2 == 0)
			{
				sum += numbers[i];
			}
			
		}
		
		return sum;
	}
	// Displays the sum of EACH consecutive pair
	// Displays the values used in sum and result (a + b = c)
	public static void displaySumOfEachConsecutivePair(int[] numbers)
	{
		int currSum;
		
		for(int i = 0; i < numbers.length - 1; i++)
		{
			currSum = numbers[i] + numbers[i+1];
			System.out.print(numbers[i] + "+" + numbers[i+1] + "= " + currSum + "\n");
		}
	}
	// Computes and returns the sum of ALL consecutive pairs in the array
	public static int computeSumOfAllConsecutivePairs(int[] numbers)
	{
		int totalSum = 0;
		int currSum;
		
		for(int i = 0; i < numbers.length-1; i++)
		{
			currSum = numbers[i] + numbers[i+1];
			totalSum += currSum;
		}
		
		return totalSum;
	}
	
	// Displays the sum of all possible pairs
	// Display the values used in sum and result (a + b = c)
	public static void displaySumOfAllPairs(int[] numbers)
	{
		int currSum;
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int ii = i+1; ii < numbers.length; ii++)
			{ 
				currSum = numbers[i] + numbers[ii];
				System.out.print(numbers[i] + "+" + numbers[ii] + " = " + currSum + "\n");
			}
		}
	}
	
	// Find and return an array with the two largest values
	public static int[] findTwoLargestValues(int[] numbers)
	{
		int twoHighest[] = new int[2];
				
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] > twoHighest[0])
			{
				twoHighest[0] = numbers[i];
			}
			
			if(numbers[i] > twoHighest[1] && numbers[i] < twoHighest[0])
			{
				twoHighest[1] = numbers[i];
			}
		}
		
		return twoHighest;
		
		
	}
	
	// Make each dog in the array bark by calling each dogs bark method
	public static void makeDogsBark(Dog[] dogArray)
	{	
		String currDogName;
		String currBark;
		
		for(int i = 0; i < dogArray.length; i++)
		{
			currDogName = dogArray[i].getName();
			currBark = dogArray[i].getBark();
			
			System.out.println(currDogName + " barks like this: " + currBark);
			
		}
	}
	
}

// dog class
class Dog 
{ 
	private String name;
	private String bark; 
	
	public Dog (String name, String bark) 
	{
		this.name = name;
		this.bark = bark;
	}

	// return dog name
	public String getName()
	{
		return name; 
	}
	
	// set dog name
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// get dog bark
	public String getBark() 
	{
	return bark;
	}
	
	// set dog bark
	public void setBark(String bark) 
	{
		this.bark = bark;
	}
}
