public class ArrayMerge
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40};
		int b[] = {50,60,70,80,90};
		int c[] = new int [a.length+b.length];

		int index = 0;

		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
			index++;
		}

		for(int i = 0; i < b.length; i++)
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