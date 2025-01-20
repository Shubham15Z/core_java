import java.util.Scanner;

public class NumberType
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1 = sc.nextInt();

		if(n1 > 0)
		{
			if(n1 % 2 == 0)
			{
				System.out.println("Positive Even number");	
			}
			else
			{
				System.out.println("Positive Odd number");	
			}
			
		}
		
		else if(n1 < 0)
		{
			if(n1 % 2 == 0)
			{
				System.out.println("Negative Even number");	
			}
			else
			{
				System.out.println("Negative Odd number");	
			}
		}
		else
		{
			System.out.println("Number is zero");
		}
		
	}
}