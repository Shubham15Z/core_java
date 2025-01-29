public class ArrayAnticlockwiseRotation
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50,60,70};

		int temp = a[0];

		for(int i = 0; i < a.length-1; i++)
		{
			a[i] = a[i+1];
		}

		a[a.length-1] = temp;

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}