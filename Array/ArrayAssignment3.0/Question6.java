/*

Q6.Given an array of size N filled with numbers from 1 to N-1 in random order. 
The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3

*/

public class Question6
{
	public static void main(String arg[])
	{
		int a[] = {1, 3, 2, 3, 4};
		
		System.out.println("The only repetative element in array is : ");
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;	
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i]);
					count++;
				}	
			}
			if(count > 0)
			{
				break;
			}	
		}
	}
}