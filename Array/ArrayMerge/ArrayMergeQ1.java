/*
a = {10,20,30,40,50}      b = {11,22,33,44,55}

c = {10,20,30,40,50,55,44,33,22,11}
*/

public class ArrayMergeQ1
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {11,22,33,44,55};
		int c[] = new int [a.length+b.length];

		int index = 0;

		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
			index++;
		}

		for(int i = b.length-1 ; i >= 0; i--)
		{
			c[index] = b[i];
			index++;
		}

		System.out.println("Array after Merging is : ");
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}