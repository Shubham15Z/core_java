/*
2.Write a Java program to shuffle a given array of integers.  
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]

*/

import java.util.Random;
public class Question2
{
	public static void main(String arg[])
	{
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		Random rd = new Random();
		
		for(int i = nums.length-1; i > 0; i--)
		{
			int j = rd.nextInt(i+1);
			System.out.print(j);
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}