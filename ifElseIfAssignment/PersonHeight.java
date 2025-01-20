import java.util.Scanner;

public class PersonHeight
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Height: ");
		int n1 = sc.nextInt();

		if(n1>=180)
		{
			System.out.println("Tall");
		}
		else if(n1>=160 && n1<180)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Short");
		}
	}
}