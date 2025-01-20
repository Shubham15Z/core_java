import java.util.Scanner;

public class NaturalNumberReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = sc.nextInt();
		int i = 1;
		System.out.println("The natural numbers in reverse order are: ");
		while(n1>=i)
		{
			System.out.println(n1);
			n1--;
		}
	}
}