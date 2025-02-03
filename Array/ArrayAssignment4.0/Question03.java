/*Q3.Given a sorted array arr[] and a number x, write a function that 
counts the occurrences of x in arr[].
Examples:
Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
Output: 4 // x (or 2) occurs 4 times in arr[]
*/

public class Question03
{
	public static void main(String arg[])
	{
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 2, count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x)
			{
				count++;
			}	
		}

		System.out.println("The occurence of "+x+" in array is : "+count+" times");
	}
}