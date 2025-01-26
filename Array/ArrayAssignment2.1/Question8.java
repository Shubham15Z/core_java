/* Q8. WAP input 10 name and print with index */

import java.util.Scanner;
public class Question8
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		sc.nextLine();
		String a [] = new String [size];

		System.out.println("Enter the names in array : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextLine();
		}
		
		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Index : "+i+" name : "+a[i]);
		}	
	}
}