/*Q4.Wap enter an array and search any particular element and find the count.*/

import java.util.Scanner;
public class Question4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		int a[] = new int [size];

		System.out.println("Enter the array elements : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("Enter the element to search : ");
		int n1 = sc.nextInt();
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == n1)
			{
				count++;
			}
		}
		System.out.println("The count of searched element i.e "+n1+" is : "+count);	
	}
}