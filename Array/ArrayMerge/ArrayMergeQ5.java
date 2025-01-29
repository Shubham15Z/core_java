/*
a = {10,20,30,40,50}      b = {11,22,33,44,55}

c = {10,55,20,44,30,33,40,22,50,11}
*/

public class ArrayMergeQ5
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {11,22,33,44,55};
		int c[] = new int [a.length+b.length];
		/*
		for(int i = 0; i < a.length; i++)
		{
			c[i*2] = a[i];
			
		}

		for(int i = 0; i < b.length; i++)
		{
			c[i*2+1] = b[b.length-i-1];
			
		}
		*/

		int x = 0, y = b.length-1;
		for(int i = 0; i < c.length; i++)
		{
			if(i % 2 == 0)
			{
				c[i] = a[x];
				x++;
			}
			else
			{
				c[i] = b[y];
				y--;
			}
		}

		System.out.println("Array after Merging is : ");
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}