public class ArrayPrint
{
	public static void main(String arg[])
	{
		int a [] = {12,45,76,34,7,0,65,3};
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[7]);
		//System.out.println(a[8]);

		System.out.println("length of array a is : "+a.length);

		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Element at index "+i+" is : "+a[i]);
		}
	}
}