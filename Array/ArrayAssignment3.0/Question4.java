/*
Q4.You are given two arrays, A and B, of equal size N. 
The task is to find the minimum value of 
A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], 
where shuffling of elements of arrays A and B is allowed.

Example 1:
Input:
N = 3
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
*/

public class Question4
{
	public static void main(String arg[])
	{
		int A[] = {3, 1, 1};
		int B[] = {6, 5, 4};

		for(int i = 0; i < A.length; i++)
		{	
			for(int j = i+1; j < A.length; j++)
			{
				if(A[i] > A[j])
				{
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}	
			}	
		}
		
		int sum = 0;
		for(int i = 0; i < A.length; i++)
		{
			sum = sum + A[i]*B[i];	
		}

		System.out.println("The minimum value is : "+sum);
	}
}