/* Q3 WAP to input an array and print its 1st and last elements */

import java.util.Scanner;
public class Question3
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

		System.out.println("The 1st element in array is : "+a[0]);
		System.out.println("The last element in array is : "+a[a.length-1]);

		
	}
}