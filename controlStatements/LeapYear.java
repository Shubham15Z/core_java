import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int n1 = sc.nextInt();
		
		if(n1%400 == 0)
		{
			System.out.println("The year is leap year");
		}
		else if(n1%4 == 0 && n1%100 !=0)
		{
			System.out.println("The year is leap year");
		}
		else
		{
			System.out.println("The year is not leap year");
		}
	}
}