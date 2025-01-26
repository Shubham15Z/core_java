/* Q7. WAP Input 10 elements in float and print it; */

import java.util.Scanner;
public class Question7
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		float a [] = new float [size];

		System.out.println("Enter the float array elements : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextFloat();
		}
		
		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+", ");
		}	
	}
}