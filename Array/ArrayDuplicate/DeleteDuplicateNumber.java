/* Wap enter an array and find the duplicate element */

import java.util.Scanner;
public class DeleteDuplicateNumber
{
	public static void main(String args[])
	{
		int a[] = {11, 44, 55, 77, 99, 11, 0, 33, 44, 22};

		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		int lock = -1;

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					a[j] = lock;
				}
			}
		}
		System.out.println();
		System.out.println("The array after lock are : ");
		for(int i = 0; i < a.length; i++)
		{	
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("After deleted duplicate array is : ");

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
			}
		}		
	}
}