/*
Q9.Given an array of integers. All numbers occur twice except one number 
which occurs once. Find the number
Example :

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2
*/


public class Question9
{
	public static void main(String arg[])
	{
		int a[] = {2, 3, 5, 4, 5, 3, 4};
		
		System.out.println("The element which occurs once is : ");
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}	
			}
			if(count == 0)
			{
				System.out.print(a[i]);
				break;
			}	
		}
	}
}