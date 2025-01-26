/* Q10.Wap enter an array and print it in reverse order.*/

import java.util.Scanner;
public class Question10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int a[] = new int [size];

		System.out.println("Enter the elements : ");

		for(int i = 0; i <= a.length - 1; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("The elements in array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The reverse elements in array are : ");
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}