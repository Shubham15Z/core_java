import java.util.Scanner;

public class TableOfNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print table: ");
		int n1 = sc.nextInt();
		int i = 1;
		System.out.println("The table for "+n1+" is:");
		while(i<=10)
		{
			System.out.println(n1+"*"+i+" = "+(n1*i));
			i++;
		}
	}
}