/*
Q1.Given an array of N integers. Find the first element that occurs at 
least K number of times.

Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7

*/

public class Question1
{
	public static void main(String arg[])
	{
		int a[] = {1,7, 4, 3, 4, 8, 7};
		int k = 2;

		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			int j;
			for(j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(j == a.length)
			{
				if(count >= k)
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
			
		}
	}
}