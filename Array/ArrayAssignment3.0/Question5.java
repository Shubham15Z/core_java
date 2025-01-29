/*Q5.Given two sorted arrays arr1 and arr2 of size N and M respectively 
and an element K. The task is to find the element that would be at 
the k’th position of the final sorted array.


Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}

Output:
6
*/

public class Question5
{
	public static void main(String arg[])
	{
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int arr3[] = new int [arr1.length+arr2.length];
		int k = 5;
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}
		for(int j = 0; j < arr2.length; j++)
		{	
			arr3[arr1.length+j] = arr2[j];	
		}
	
		

		for(int i = 0; i < arr3.length; i++)
		{	
			for(int j = i+1; j < arr3.length; j++)
			{
				if(arr3[i] > arr3[j])
				{
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}	
			}	
		}
		
		System.out.println("The element at gievn position is : ");
		for(int j = 0; j < arr3.length; j++)
		{
			if(k == j)	
			System.out.println(arr3[j-1]+" ");	
		}
	}
}