/* Q13 WAP to input an array and find number of 0's, number of positive numbers and number of negative numbers */

import java.util.Scanner;
public class Question13
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
		
		System.out.println("The array elements are : ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		int countZero = 0, countPositive = 0, countNegative = 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				countZero++;
			}
			else if(a[i]>0)
			{
				countPositive++;
			}
			else
			{
				countNegative++;
			}
		}
		System.out.println("The number of 0's are : "+countZero);
		System.out.println("The number of positive numbers are : "+countPositive);
		System.out.println("The number of negative numbers are : "+countNegative);
	}
}