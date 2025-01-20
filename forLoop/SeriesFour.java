import java.util.Scanner;

public class SeriesFour
{
	public static void main(String arg[])
	{	int sum = 0, sum2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number of series: ");
		int n1 = sc.nextInt();
		
		for(int i = 1; i<=n1; i++)
		{
			sum = sum + i;
			sum2 = sum2 + sum; 
		}
		System.out.println("The sum of series is: "+sum2);
	}
}


//1 i=1
//2 i=2 3 = 2+1
//3 6 = 3+3
//4 10 = 4 + 6