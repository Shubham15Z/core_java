/*
Q7.Given two unsorted arrays that represent two sets (elements in every array 
are distinct), find the union and intersection of two arrays.

Example:
arr1[] = {7, 1, 5, 2, 3, 6}
arr2[] = {3, 8, 6, 20, 7}

Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and 
Intersection as {3, 6, 7}. Note that the elements of union and intersection 
can be printed in any order.
*/

public class Question7
{
	public static void main(String arg[])
	{
		int arr1[] = {7, 1, 5, 2, 3, 6};
		int arr2[] = {3, 8, 6, 20, 7};
		int arr3[] = new int [arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}

		for(int i = 0; i <arr2.length; i++)
		{
			arr3[arr1.length+i] = arr2[i];
		}

		System.out.println("The Intersection elements in array are : ");
		for(int i = 0; i < arr3.length; i++)
		{
			for(int j = i+1; j < arr3.length; j++)
			{
				if(arr3[i] == arr3[j])
				{
					System.out.print(arr3[i]+", ");
				}
			}	
				
		}

		for(int i = 0; i < arr3.length; i++)
		{	
			for(int j = i+1; j < arr3.length; j++)
			{
				if(arr3[i] == arr3[j])
				{
					arr3[j] = -1;
				}	
			}	
		}

		System.out.println();
		System.out.println("The Union elements in array are : ");
		for(int i = 0; i < arr3.length; i++)
		{	
			if(arr3[i] != -1)
			{
				System.out.print(arr3[i]+", ");
			}	
		}

		
		
	}
}