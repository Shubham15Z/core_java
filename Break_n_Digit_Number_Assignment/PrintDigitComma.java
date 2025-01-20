import java.util.Scanner;

public class PrintDigitComma
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int n = sc.nextInt();
		
		int i = n, rem;
		System.out.println("The Digits are: ");
		while(i > 0)
		{
			rem = i % 10;
			System.out.print(rem+",");
			i = i / 10;
		}
	}
}