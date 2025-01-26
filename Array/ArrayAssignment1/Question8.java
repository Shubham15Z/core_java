/* Q8.Wap enter an array and print the  square of the element which is on even position.*/

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

		System.out.println("The elements in array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The square of elements at even position are : ");
		for(int i = 0; i <= a.length - 1; i++)
		{
			int pos = i+1;
			if(pos % 2 == 0)
			{
				System.out.print(a[pos-1]*a[pos-1]+" ");
			}
		}
	}
}