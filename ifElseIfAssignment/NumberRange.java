import java.util.Scanner;

public class NumberRange
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int s1 = sc.nextInt();
		
		if(s1 < 10)
		{
			System.out.println("Small");
		}
		else if(s1>=10 && s1<20)
		{
			System.out.println("Medium");
		}
		else
		{
			System.out.println("Large");
		}
		
	}
}