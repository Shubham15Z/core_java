import java.util.Scanner;

public class CheckTriangleType
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st side:");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd side:");
		int n2 = sc.nextInt();
		System.out.println("Enter the 3rd side:");
		int n3 = sc.nextInt();
		
		if(n1==n2 && n2==n3)
		{
			System.out.println("Equilateral Triangle");
		}
		else if(n1==n2 || n2==n3 || n1==n3)
		{
			System.out.println("Isosceles Triangle");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}
	}
}