import java.util.Scanner;

public class SumNaturalNumber
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
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of Natural numbers between 1 to "+n1+" is : "+sum);
	}	
}