/* Q6 WAP to input an array and find its average */

import java.util.Scanner;
public class Question6
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
		float sum = 0;
		float avg;
		for(int i = 0; i <= a.length - 1; i++)
		{
			sum = sum + a[i];
		}
		
		avg = sum/(a.length);

		System.out.println("The sum of element in array is : "+sum);
		System.out.println("The average of element in array is : "+avg);


		
	}
}