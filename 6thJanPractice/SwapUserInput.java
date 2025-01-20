import java.util.Scanner;

public class SwapUserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int n2 = sc.nextInt();

		System.out.println("Before swap: \n n1 = "+n1+" and n2 = "+n2);
		
		int c = n1;
		n1 = n2;
		n2 = c;

		System.out.println("After swap: \n n1 = "+n1+" and n2 = "+n2);
	}
}