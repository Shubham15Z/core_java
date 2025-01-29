public class ClockwiseRotation
{
	public static void main(String arg[])
	{
		int a[] = {10,20,30,40,50,60,70};

		int temp = a[a.length-1];

		for(int i = a.length-1; i > 0; i--)
		{
			a[i] = a[i-1];
		}

		a[0] = temp;

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}