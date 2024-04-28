/*
 *  Name: Kaden Bilyeu
 *  Class: CS1150 Section 2
 *  Due:  January 30, 2023
 *  Description: Assignment #2
 *  This program demonstrates that I probably understand how to deal with user input and variables by writing a progrm
 *  that can determine how much electricity is used by two appliances.
 */

// imports
import java.util.*;

// class and main
public class BilyeuKadenAssignment2 {
	public static void main(String[] args)
	{
		
		//vars
		final double numWattsPerKilowatt = 1000.00;
		final double costPerKilowattHour = 0.15d;
		final int daysInMonth = 30;
		
		String applianceOneName = "";
		int applianceOneWattage = 0;
		int applianceOneAverageUsage = 0;
		double watthoursPerDay1 = 0.0d;
		double kilowattHoursPerDay1 = 0.0d;
		double kilowattHoursPerMonth1 = 0.0d;
		double monthlyCost1 = 0.0d;
		
		
		String applianceTwoName = "";
		int applianceTwoWattage = 0;
		int applianceTwoAverageUsage = 0;
		double watthoursPerDay2 = 0.0d;
		double kilowattHoursPerDay2 = 0.0d;
		double kilowattHoursPerMonth2 = 0.0d;
		double monthlyCost2 = 0.0d;
				
		// create scanner object
		Scanner scanner = new Scanner(System.in);
		
		// get applianceOne details
		System.out.print("Please enter the first appliances name : ");
		applianceOneName = scanner.next();
		
		System.out.print("Please enter the " + applianceOneName + "'s wattage : ");
		applianceOneWattage = scanner.nextInt();
		
		System.out.print("Please enter the " + applianceOneName + "'s average usage per day : ");
		applianceOneAverageUsage = scanner.nextInt();
		
		// get appliance two details
		System.out.print("\nPlease enter the second appliances name : ");
		applianceTwoName = scanner.next();
		
		System.out.print("Please enter the " + applianceTwoName + "'s wattage : ");
		applianceTwoWattage = scanner.nextInt();
		
		System.out.print("Please enter the " + applianceTwoName + "'s average usage per day : ");
		applianceTwoAverageUsage = scanner.nextInt();
		
		// calculate stats for appliances
		watthoursPerDay1 = applianceOneWattage * applianceOneAverageUsage;
		watthoursPerDay2 = applianceTwoWattage * applianceTwoAverageUsage;
		
		kilowattHoursPerDay1 =  watthoursPerDay1 /  numWattsPerKilowatt;
		kilowattHoursPerDay2 =  watthoursPerDay2 /  numWattsPerKilowatt;
		
		kilowattHoursPerMonth1 = kilowattHoursPerDay1 * daysInMonth;
		kilowattHoursPerMonth2 = kilowattHoursPerDay2 * daysInMonth;
		
		monthlyCost1 =  kilowattHoursPerMonth1 * costPerKilowattHour;
		monthlyCost2 =  kilowattHoursPerMonth2 * costPerKilowattHour;
		
		// output table
		System.out.println("Appliance\t\tkWh per Day\tkWh per Month\tCost Per Month\n-----------------------------------------------------------------------------");
		System.out.printf("%s\t\t%5.2f\t\t5%.2f\t\t$%5.2f",applianceOneName,kilowattHoursPerDay1,kilowattHoursPerMonth1,monthlyCost1);
		System.out.printf("\n%s   \t\t%5.2f\t\t5%.2f\t\t$%5.2f",applianceTwoName,kilowattHoursPerDay2,kilowattHoursPerMonth2,monthlyCost2);
		System.out.print("\n-----------------------------------------------------------------------------");
		System.out.printf("\nTotals   \t\t%5.2f\t\t%5.2f\t\t$%5.2f",(kilowattHoursPerDay1 +kilowattHoursPerDay2),(kilowattHoursPerMonth1 +kilowattHoursPerMonth2),(monthlyCost1 +monthlyCost2));
	}
}
