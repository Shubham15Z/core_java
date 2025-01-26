/*Q1. WAP to merge two Array and print the final array.*/

public class Question1
{
	public static void main(String args[])
	{
		int a[] = {3, 0, 4, 7, 8};
		int b[] = {3, 75, 61, 34, 9};

		int size = a.length + b.length;

		int c[] = new int [size];

		for(int i = 0; i < a.length; i++)
		{	
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}