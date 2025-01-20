import java.util.Scanner;

public class SeriesOne
{
	public static void main(String arg[])
	{	int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number of series: ");
		int n1 = sc.nextInt();
		
		for(int i = 1; i<=n1; i=i+2)
		{
			sum = sum + i;
		}
		System.out.println("The sum of series is: "+sum);
	}
}