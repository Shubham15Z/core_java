/*
6. Find a peak element which is not smaller than its neighbours
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are 
less than 20.
Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are 
less than 20, similarly 90 has neighbors 23 and 67.
*/

public class Question6
{
	public static void main(String arg[])
	{
		int array[]= {10, 20, 15, 2, 23, 90, 67};
		int peak = array[0];
		System.out.println("The peak elements are : ");
		for(int i = 1; i < array.length-1; i++)
		{
			if(array[i]>array[i-1] && array[i]>array[i+1])
			{
				System.out.print(array[i]+" ");
			}		
		}
	}
}