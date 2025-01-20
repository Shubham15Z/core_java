import java.util.Scanner;

public class SeasonCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int n1 = sc.nextInt();

		if(n1 == 1 || n1 == 2 || n1 == 12)
		{
			System.out.println("Winter");
		}
		else if(n1 == 3 || n1 == 4 || n1 == 5)
		{
			System.out.println("Spring");
		}
		else if(n1 == 6 || n1 == 7 || n1 ==8)
		{
			System.out.println("Summer");
		}
		else if(n1 == 9 || n1 == 10 || n1 == 11)
		{
			System.out.println("Fall");
		}
		else
		{
			System.out.println("Please enter valid season month....!!");
		}
	}
}