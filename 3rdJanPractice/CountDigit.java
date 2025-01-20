import java.util.Scanner;

public class CountDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0, rem;

		for(int i = n ; i>0; i = i/10)
		{
			count++;
		}
		System.out.println("The Digit count is: "+count);
		
		
	}
}