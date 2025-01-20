import java.util.Scanner;

public class NaturalNumberReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1 = sc.nextInt();
		System.out.println("Natural Numbers in reverse order are:");
		
		while(n1>=1)
		{
			System.out.println(n1);
			n1--;
		}
	}
}