/* Q6.Wap enter an array and find the duplicate element */

import java.util.Scanner;
public class DuplicateNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		int a[] = new int [size];

		System.out.println("Enter the array elements : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("The duplicate element in array are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}		
	}
}