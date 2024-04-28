/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  April 6, 2023
 *  Description: Assignment #9
 *  This program demonstrates that I probably understand how to manipulate arrays  by 
 *  creating a program that uses multiple functions to perform various manipulations on several arrays
 */

import java.util.*;
import java.lang.Math;

public class BilyeuKadenAssignment9 
{
	public static void main(String[] args)
	{
		// vars
		int[] original = new int[12];
		
		int[] even;
		int[] odd;
		int[] oddEvenArray;
		int[] mergedArray;
		
		int[] array1 = {1, 2, 10, 11, 12, 14};
		int[] array2 = {3, 4, 5, 13, 15, 16, 17};
		
		int numEven = 0;
		int numOdd = 0;
		
		// populate original and determine num of evens/odds
		for(int i = 0; i < 12; i++)
		{
			original[i] = 1 + (int)(Math.random() * 50);
			
			if(original[i] % 2 == 0)
			{
				numEven++;
			}
			else
			{
				numOdd++;
			}
				
		}
		// initialize even and odd arrays
		even = new int[numEven];
		odd = new int[numOdd];
		
		// manipulate arrays
		fillEvenAndOddArrays(original,even,odd);
		oddEvenArray = combineTwoArrays(even, odd);
		descendingOrderSort(oddEvenArray);
		mergedArray = sortedMerge(array1,array2);
		descendingOrderSort(mergedArray);
		
		// displays results
		display(original,"Original Array");
		display(even,"Even Array Sorted");
		display(odd,"Odd Array Sorted");
		display(oddEvenArray,"Combined Array Sorted in Descending Order (largest to smallest)");
		display(mergedArray,"Manually Merged Array Sorted in Descending Order (largest to smallest)");
	}
	
	// Place the even and odd values in the original array into an even array & odd array
	public static void fillEvenAndOddArrays (int[] original, int[] even, int[] odd)
	{
		
		int numEven = 0;
		int numOdd = 0;
		
		for(int i = 0; i < original.length; i++)
		{
			if(original[i] % 2 == 0)
			{
				even[numEven] = original[i];
				numEven++;
			}
			else
			{
				odd[numOdd] = original[i];
				numOdd++;
			}
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);
		
	}
	
	// Displays the values in ONE array. The variable nameOfArray is a string describing
	// the array that is displayed on the console
	public static void display (int[] list, String nameOfArray)
	{
		System.out.print("\n" + nameOfArray + "\n-----------------------------\n");
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.println("array[" + i + "] = " + list[i]);
			
		}
	}
	
	// Combine two arrays into one unsorted array; return this unsorted combined array.
	// Place all values from array1 into combined array followed by all values in array2
	public static int[] combineTwoArrays(int[] array1, int[] array2)
	{
		int[] newArray = new int[array1.length + array2.length];
		
		int i = 0;

		while(i < array1.length)
		{
			newArray[i] = array1[i];
			i+=1;
		}
		
		for(int j = 0; j < array2.length; j++)
		{
			newArray[i] = array2[j];
			i+=1;
		}
		
		return newArray;
	}
	
	// Sort an array into descending order
	public static void descendingOrderSort(int[] array)
	{
	    Arrays.sort(array);
	    
	    for(int i = 0; i < array.length / 2; i++)
	    {
	        int temp = array[i];
	        array[i] = array[array.length-1-i];
	        array[array.length-1-i] = temp;
	    }

	}
	
	// Merge two sorted arrays into one sorted array without using Arrays.sort method.
	// Return the sorted merged array.
	public static int[] sortedMerge(int[] array1, int[] array2)
	{
		int[] newArray = new int[array1.length + array2.length];
		
		int arrayOneIndex = 0;
		int arrayTwoIndex = 0;
		
		for(int i = 0; i < newArray.length; i++)
		{
			if(arrayOneIndex < array1.length && array1[arrayOneIndex] < array2[arrayTwoIndex])
			{
				newArray[i] = array1[arrayOneIndex];
				arrayOneIndex++;
			}
			else
			{
				newArray[i] = array2[arrayTwoIndex];
				arrayTwoIndex++;		
			}
			
		}
		
		return newArray;
	}

}
