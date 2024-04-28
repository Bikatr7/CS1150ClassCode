import java.util.*;

public class BilyeuKadenWorksheet4 {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		int i = 0;
		int target = 10;
		int sum = 0;
		
		while(number < 1)
		{
			System.out.print("Please enter a positive number : ");
			number = scanner.nextInt();
		}
		
		while(i < target)
		{
			sum += i;
			i+=1;
			
		}
		
		System.out.println(sum);
		
		sum = 0;
		
		for(int ii = 0; ii < target; ii++)
		{
			sum += ii;
					
		}
		
		System.out.print(sum);
		
	}
}