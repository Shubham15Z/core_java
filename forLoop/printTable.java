import java.util.Scanner;

public class printTable
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n1+"*"+i+" = "+(i*n1));
		}
	}
}