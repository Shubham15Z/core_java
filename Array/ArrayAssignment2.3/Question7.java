/*Q7.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},*/


public class Question7
{
	public static void main(String arg[])
	{
		int [] a={9,1,3,5,6,11,22,66,10,19};
		
		System.out.println("The array elements are : ");
		for(int j = 0; j < a.length; j++)	
		{
			System.out.print(a[j]+" ");
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int mid = a.length/2;
		int start = mid;
		int end = a.length - 1;

		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

		System.out.println();
		System.out.println("The Half sorted array elements are : ");
		for(int j = 0; j < a.length; j++)	
		{
			System.out.print(a[j]+" ");
		}	
	}
}

