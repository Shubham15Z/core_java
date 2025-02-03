/*
7.K’th Largest Element in Unsorted Array
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
Output: 10
*/

public class Question7
{
	public static void main(String arg[])
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}		
		}

		System.out.println("The "+k+" th Smallest element is : "+arr[k-1]);
	}
}