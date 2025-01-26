import java.util.Scanner;

public class ArrayUserInput
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int a[] = new int [size];

		System.out.println("Enter the elements in array : ");
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("The elements in array are : ");

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}