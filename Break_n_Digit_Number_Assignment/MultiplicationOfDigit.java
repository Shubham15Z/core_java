import java.util.Scanner;

public class MultiplicationOfDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem, multi = 1;
		System.out.println("The Digits are: ");
		while(i > 0)
		{
			rem = i % 10;
			System.out.println(rem);
			if(rem > 0)
			{
				multi = multi * rem;
			}
			i = i / 10;
		}
		System.out.println("Multiplication of all the digits is : "+multi);
	}
}