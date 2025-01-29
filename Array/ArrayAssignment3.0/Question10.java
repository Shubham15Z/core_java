/*
Q10.Given an array arr[] of integers, segregate even and odd numbers in the array. 
Such that all the even numbers should be present first, and then the odd numbers.

Examples:  

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11

*/
public class Question10
{
	public static void main(String arg[])
	{
		int a[] = {1, 9, 5, 3, 2, 6, 7, 11};
		int b[] = new int [a.length];
		int index = 0;

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				b[index] = a[i];
				index++;
			}	
		}

		for(int i = 0; i <a.length; i++)
		{
			if(a[i] % 2 != 0)
			{
				b[index] = a[i];
				index++;
			}
		}

		System.out.println("The even odd order of element is : ");
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}