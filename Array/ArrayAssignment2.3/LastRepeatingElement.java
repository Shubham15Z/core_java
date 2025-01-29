public class LastRepeatingElement
{
	public static void main(String arg[])
	{
		int a[] = {1,3,6,7,9,3,2,6,7,2};
		int c = 0;

		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					c = i;
				}
			}
		}
		System.out.println("The index of last reapeting element is : "+c);
	}
}