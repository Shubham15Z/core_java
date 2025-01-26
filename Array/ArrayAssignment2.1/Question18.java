/*Q18.Wap input two array and merge in third array.*/

import java.util.Scanner;
public class Question18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array :");
		int s1 = sc.nextInt();
		int a[] = new int [s1];

		System.out.println("Enter the size of 2nd array :");
		int s2 = sc.nextInt();
		int b[] = new int [s2];

		System.out.println("Enter the elements in 1st array : ");
		for(int i = 0; i <= a.length - 1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the elements in 2nd array : ");
		for(int i = 0; i <= b.length - 1; i++)
		{
			b[i] = sc.nextInt();
		}
		
		System.out.println("The elements in 1st array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("The elements in 2nd array are :");
		for(int i = 0; i <= b.length - 1; i++)
		{
			System.out.print(b[i]+" ");
		}

		int c [] = new int [s1+s2];
		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++)
		{
			c[i+a.length] = b[i];
		}
		System.out.println();
		System.out.println("The elements in 3rd array are :");
		for(int i = 0; i <= c.length - 1; i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
	}
}