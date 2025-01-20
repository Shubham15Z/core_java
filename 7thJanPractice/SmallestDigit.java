import java.util.Scanner;

public class SmallestDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int min = 9, rem; 

		for(int i = n; i > 0; i = i / 10)
		{
			rem = i % 10;
			if(rem < min)
			{
				min = rem;
			}
		}
		System.out.println("The minimum digit is : "+min);
	}
}