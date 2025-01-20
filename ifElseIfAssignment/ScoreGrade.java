import java.util.Scanner;

public class ScoreGrade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Score: ");
		int n1 = sc.nextInt();

		if(n1>90 && n1<=100)
		{
			System.out.println("Your Grade is: A");
		}
		else if(n1>80 && n1<=90)
		{
			System.out.println("Your Grade is: B");
		}
		else if(n1>65 && n1<=80)
		{
			System.out.println("Your Grade is: C");
		}
		else if(n1>50 && n1<=65)
		{
			System.out.println("Your Grade is: D");
		}
		else if(n1<=50)
		{
			System.out.println("Your Grade is: F");
		}
		else
		{
			System.out.println("Please enter valid score....!!");
		}
	}
}