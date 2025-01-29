/*
a = {10,20,30,40,50}      b = {11,22,33,44,55}

c = {50,11,40,22,30,33,20,44,10,55}
*/

public class ArrayMergeQ6
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {11,22,33,44,55};
		int c[] = new int [a.length+b.length];
		
		for(int i = 0; i < a.length; i++)
		{
			c[i*2] = a[a.length-1-i];
			
		}

		for(int i = 0; i < b.length; i++)
		{
			c[i*2+1] = b[i];
			
		}
		
		/*
		int x = a.length-1, y = 0;
		for(int i = 0; i < c.length; i++)
		{
			if(i % 2 == 0)
			{
				c[i] = a[x];
				x--;
			}
			else
			{
				c[i] = b[y];
				y++;
			}
		}
		*/

		System.out.println("Array after Merging is : ");
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}