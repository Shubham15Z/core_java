/*
5. Write a Java program to find maximum difference between two elements 
in a given array of integers such that smaller element appears before 
larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10
*/

public class Question5
{
	public static void main(String arg[])
	{
		int nums[] = {2, 3, 1, 7, 9, 5, 11, 3, 5};
		int min = nums[0], max = nums[0];
		int maxDiff = 0;
		
		/*
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
			else
			{
				int diff = nums[i] -  min;
				if(diff > maxDiff)
				{
					maxDiff = diff;
				}
			}		
		}
		*/

		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
			else if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		
		System.out.println("The Maximum difference is : "+(max-min));
	}
}