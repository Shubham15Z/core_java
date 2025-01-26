/* Q15.Wap to input an array and and print the  sum and count of  even no.*/

import java.util.Scanner;
public class Question15
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
		int sum = 0;
		int evenCount = 0;
		for(int i = 0; i <= a.length - 1; i++)
		{
			if(a[i] % 2 == 0)
			{
				sum = sum + a[i];
				evenCount++;
			}
		}
		System.out.println("The sum of even numbers in array is : "+sum);
		System.out.println("The count of even numbers in array is : "+evenCount);		
	}
}