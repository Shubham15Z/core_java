/* Q12.Wap input an array and delete all duplicate element from array. */

import java.util.Scanner;
public class Question12
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
		
		System.out.println();
		System.out.println("Enter the array element from given array to delete : ");
		int del = sc.nextInt();

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == del)
			{
				a[i] = -1;
			}
		}

		System.out.println("The array elements after deleting : ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
			}	
		}
	}
}