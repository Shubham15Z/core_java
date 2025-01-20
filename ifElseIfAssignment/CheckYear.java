import java.util.Scanner;

public class CheckYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int n1 = sc.nextInt();
		
		if(n1%100 == 0)
		{
			if(n1%400 == 0)
			{
				System.out.println("Its a leap year");
			}
			else
			{
				System.out.println("Its a Century year");
			}			
		}
		else 
		{
			if(n1%4 == 0)
			{
				System.out.println("Its a leap year");
			}
			else
			{
				System.out.println("Its a Regular year");
			}
		}
	}
}

