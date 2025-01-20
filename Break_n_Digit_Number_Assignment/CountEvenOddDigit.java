import java.util.Scanner;

public class CountEvenOddDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, evenCount = 0, oddCount = 0;
		System.out.println("  ");
		while(i > 0)
		{
			rem = i % 10;
			//System.out.println(rem);
			if(rem % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			i = i / 10;
		}
		System.out.println("Even digit count is : "+evenCount);
		System.out.println("Odd digit count is : "+oddCount);
	}
}