import java.util.Scanner;

public class NaturalNumberPrint
{
	public static void main(String[] args)
	{
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = sc.nextInt();
		System.out.println("Natural numbers from 1 to "+n1+" are: ");
		
		while(i<=n1)
		{
			System.out.println(i);
			i++;
		}
	}
}