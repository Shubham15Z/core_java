import java.util.Scanner;

public class PrintReverseNumber
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		System.out.println("Reverse number from the: "+n1);
		for(int i = n1; i>0; i--)
		{
			System.out.println(i);
		}
	}	
}
