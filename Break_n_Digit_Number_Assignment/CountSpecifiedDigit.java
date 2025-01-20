import java.util.Scanner;

public class CountSpecifiedDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		System.out.println("Enter a specific digit :");
		int d = sc.nextInt();

		int i = n, rem, count = 0;
		System.out.println("  ");
		while(i > 0)
		{
			rem = i % 10;
			if(rem > d)
			{
				count++;
			}
			i = i / 10;
		}
		System.out.println("The count of digits greater than specified digit is: "+count);
	}
}