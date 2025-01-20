import java.util.Scanner;

public class OddNumberSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n1)
		{
			if(i%2 != 0)
			{
				sum = sum + i;	
			}
			
			i++;
		}
		System.out.println("The sum of all Odd numbers between 1 to "+n1+" is : "+sum);
	}	
}