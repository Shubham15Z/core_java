/*
Q4.Given an array of N integers, and a number sum, the task is to find the 
number of pairs of integers in the array whose sum is equal to sum.
Examples:  
Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2

*/

public class Question4
{
	public static void main(String arg[])
	{
		int a[] = {1, 5, 7, -1};
		int sum = 6, count = 0;

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j] == sum)
				{
					count++;
				}
			}
		}
		System.out.println("The number of pairs are : "+count);	
	}
}