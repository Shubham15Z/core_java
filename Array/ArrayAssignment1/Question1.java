/* Q1.Wap enter an array and find the sum and count of element present at even position.*/

import java.util.Scanner;
public class Question1
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
		int sum = 0, evenPosCount = 0;
		for(int i = 0; i <= a.length - 1; i++)
		{
			int pos = i+1;
			if(pos % 2 == 0)
			{
				sum = sum + a[pos-1];
				evenPosCount++;
			}
		}
		System.out.println();
		System.out.println("The sum of even position numbers in array is : "+sum);
		System.out.println("The count of even position numbers in array is : "+evenPosCount);		
	}
}