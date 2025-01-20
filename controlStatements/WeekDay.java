import java.util.Scanner;

public class WeekDay
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week number:");
		int n1 = sc.nextInt();
		
		if(n1 == 1)
		{
			System.out.println("Monday");
		}
		else if(n1 == 2)
		{
			System.out.println("Tuesday");
		}
		else if(n1 == 3)
		{
			System.out.println("Wednsday");
		}
		else if(n1 == 4)
		{
			System.out.println("Thursday");
		}
		else if(n1 == 5)
		{
			System.out.println("Friday");
		}
		else if(n1 == 6)
		{
			System.out.println("Saturday");
		}
		else if(n1 == 7)
		{
			System.out.println("Sunday");
		}
		else 
		{
			System.out.print("Enter valid week number");
		}
	}
}