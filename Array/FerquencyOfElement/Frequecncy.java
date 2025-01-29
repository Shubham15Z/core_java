public class Frequecncy
{
	public static void main(String arg[])
	{
		int a[] = {2,5,7,8,3,5,1,6,8,2,4,5,9};
		
		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					a[j] = -1;
					count++;	
				}
			}
			if(a[i] != -1)
			{
				System.out.println("Frequency of "+a[i]+" is "+count);
			}
		}
	}
}