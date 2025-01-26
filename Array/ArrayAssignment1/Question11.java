/* Q11.Wap enter an array and find the no in array  which is equal to the sum of 1st and last element.*/

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

		System.out.println("The elements in array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		int sum = a[0]+a[a.length-1];
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == sum)
			{
				System.out.println("The element index is :"+i+" and element is : "+a[i]);
			}
		}	
	}
}