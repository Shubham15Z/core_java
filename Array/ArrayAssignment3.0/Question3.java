/*
Q3.Given an array A of n positive numbers. The task is to find the first 
Equilibrium Point in an array. Equilibrium Point in an array is a position 
such that the sum of elements before it is equal to the sum of elements after it.
Note: Retun the index of Equilibrium point. (1-based index)
Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3

*/

public class Question3
{
	public static void main(String arg[])
	{
		int A[] = {1,3,5,2,2};
		
		for(int i = 0; i < A.length; i++)
		{
			int lsum = 0, rsum = 0;
			for(int j = 0; j < i; j++)
			{
				lsum += A[j];
			}

			for(int j = i+1; j < A.length; j++)
			{
				rsum += A[j];
			}

			if(lsum == rsum)
			{
				System.out.println("The Equilibrium element is : "+A[i]);
				System.out.println("The Equilibrium element index is : "+i);
				System.out.println("The Equilibrium element position is : "+(i+1));
			}
		}
	}
}