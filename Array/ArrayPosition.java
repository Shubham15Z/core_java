public class ArrayPosition
{
	public static void main(String arg[])
	{
		int a[] = {10,45,34,95,0,234,78,48,9};
		
		for(int i = 0; i <= a.length-1; i++)
		{
			System.out.println("Element at index "+i+" is "+a[i]+" and its position is "+(i+1));
		}			
	}
}