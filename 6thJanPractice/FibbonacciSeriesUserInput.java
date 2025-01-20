import java.util.Scanner;

public class FibbonacciSeriesUserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number in the series: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number in the series: ");
		int n2 = sc.nextInt();

		System.out.println("The fibbonacci series from "+n1+" and "+n2+" till 10 terms is: ");
		System.out.print(n1+" "+n2);
		
		for(int i = 1; i <= 8; i++)
		{
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}