/*Q12. Wap to input an array and find its average of first 5 element. */

import java.util.Scanner;
public class Question12
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int a [] = new int [size];

		System.out.println("Enter the array elements : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+", ");
		}

		float sum = 0; 
		float avg;
		for(int i = 0; i < a.length; i++)
		{
			if(i < 5)
			{
				sum = sum + a[i];
			}
		}
		avg = sum/5;
		System.out.println();
		System.out.println("The average of 1st five elements is : "+avg);	
	}
}