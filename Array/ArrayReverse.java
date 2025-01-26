public class ArrayReverse
{
	public static void main(String arg[])
	{
		int a[] = {10,45,34,95,0,234,78,48,9};
		
		System.out.println("The elements in array are : ");

		for(int i = 0; i <= a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The reverse elements in array are : ");

		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i]+" ");
		}			
	}
}