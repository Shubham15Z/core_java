/*Q1.Given an array arr[] of integers. Find a peak element i.e. an 
element that is not smaller than its neighbors.

Note: For corner elements, we need to consider only one neighbor.

Example:
Input: array[]= {5, 10, 20, 15}
Output: 20
*/

public class Question01
{
	public static void main(String arg[])
	{
		int array[]= {5, 10, 20, 15};
		System.out.println("The peak elements are : ");
		for(int i = 0; i < array.length; i++)
		{
			if((i == 0 || array[i]>array[i-1]) && (i == array.length-1 || array[i]>array[i+1]))
			{
				System.out.print(array[i]+" ");
			}
					
		}
	}
}