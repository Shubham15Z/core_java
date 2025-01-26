public class MergeArray
{
	public static void main(String arg[])
	{
		int a[] = {2,6,3,8,9};
		int b[] = {10,30,50,20};

		int c[] = new int [a.length+b.length];

		for(int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		System.out.println("The merged array is : ");
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}