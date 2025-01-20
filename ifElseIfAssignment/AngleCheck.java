import java.util.Scanner;

public class AngleCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Angle: ");
		int n1 = sc.nextInt();

		if(n1 == 180)
		{
			System.out.println("Straight");
		}
		else if(n1 > 90 && n1 < 180)
		{
			System.out.println("Obtuse");
		}
		else if(n1 == 90)
		{
			System.out.println("Right");
		}
		else if(n1 > 1 && n1 < 90)
		{
			System.out.println("Acute");
		}
		else
		{
			System.out.println("Enter valid Angle....");
		}
	}
}