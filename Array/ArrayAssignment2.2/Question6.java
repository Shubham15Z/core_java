/*
Q.6Write a Java program to separate even and odd numbers of a given array of 
integers. Put all even numbers first, and then odd numbers
*/
public class Question6
{
	public static void main(String arg[])
	{
		int a [] = {2,54,34,23,9,8,5};
		int start = 0, end = a.length - 1;

		while(start < end)
		{
			if(a[start] % 2 == 0)
			{
				start++;
			}
			else if(a[end] % 2 != 0)
			{
				end--;
			}
			else
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println("Even odd Separate array : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}