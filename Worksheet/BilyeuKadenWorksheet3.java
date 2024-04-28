import java.util.*;

public class BilyeuKadenWorksheet3 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String password = "";
		
		System.out.print("Enter password : ");
		password = scanner.next();
		
		while(!password.equals("October"))
		{
			System.out.println(password + " is not a valid password. try again");
			System.out.print("Enter password again : ");
			password = scanner.next();
		}
	
		System.out.println(password + " is a valid password!");
		
		System.out.println("First character in the password is : " + password.charAt(0));
		System.out.println("Last character in the password is : " + password.charAt(password.length()-1));
	}
}