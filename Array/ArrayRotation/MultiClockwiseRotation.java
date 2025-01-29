import java.util.Scanner;
public class MultiClockwiseRotation
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50,60,70};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of clockwise rotations : ");
		int n = sc.nextInt();
		

		for(int j = 0; j < n; j++)
		{
			int temp = a[a.length-1];

			for(int i = a.length-1; i > 0; i--)
			{
				a[i] = a[i-1];
			}

			a[0] = temp;
		}
		
		System.out.println("Clockwise rotation : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}