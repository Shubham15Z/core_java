/* Q8 WAP to input an array and print odd number*/

import java.util.Scanner;
public class Question8
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

		System.out.println("The elements in array are");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The odd number in array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			if(a[i] % 2 == 1)
			{
				System.out.print(a[i]+" ");
			}
		}		
	}
}