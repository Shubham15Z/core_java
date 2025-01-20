import java.util.Scanner;

public class MinSecmin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int min = 9, secmin = 8, rem;
		int i = n;

		while(i > 0)
		{
			rem = i % 10;
			if(rem < min)
			{
				secmin = min;
				min = rem;
			}
			else if( rem < min && rem != min)
			{
				secmin = rem;
			}
			i = i / 10;
		}
		System.out.println("Minimum digit is : "+min);
		System.out.println("Second minimum digit is : "+secmin);
	}
}