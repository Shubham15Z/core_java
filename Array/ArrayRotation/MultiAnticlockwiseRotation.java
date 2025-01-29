import java.util.Scanner;
public class MultiAnticlockwiseRotation
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50,60,70};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotations : ");
		int n = sc.nextInt();
		

		for(int j = 0; j < n; j++)
		{
			int temp = a[0];

			for(int i = 0; i < a.length-1; i++)
			{
				a[i] = a[i+1];
			}

			a[a.length-1] = temp;
		}
		
		System.out.println("Anticlockwise rotation : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}