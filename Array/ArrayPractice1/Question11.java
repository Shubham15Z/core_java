/* Q11 WAP to input an array and print 1st, 2nd and 3rd element */

import java.util.Scanner;
public class Question11
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
		
		System.out.println("The array elements are : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("The 1st, 2nd and 3rd array elements are : ");
		for(int i = 0; i<a.length; i++)
		{
			if(i<3)
			System.out.print(a[i]+" ");
		}
	}
}