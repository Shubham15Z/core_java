import java.util.Scanner;

public class EvenNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number: ");
		int n = sc.nextInt();

		System.out.println("The even numbers from 1 to "+n+" are : ");
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			System.out.println(i);
		}
	}
}