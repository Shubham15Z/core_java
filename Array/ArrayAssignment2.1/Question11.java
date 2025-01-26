/*Q11. WAP input 10 elements and multiply 5th elements by 25. */

import java.util.Scanner;
public class Question11
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

		for(int i = 0; i < a.length; i++)
		{
			if(i == 4)
			{
				a[i] = 5*a[i];
				break;
			}
		}
		System.out.println();
		System.out.println("The array after multiplication : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}