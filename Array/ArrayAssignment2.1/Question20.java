/* Q20.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,66,22,19,11,10} */

public class Question20
{
	public static void main(String args[])
	{
		int a [] = {9,1,3,5,6,11,22,66,10,19};

		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
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
		int end = a.length-1;

		for(int i = start; i <= end; i++)
		{
			int temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			end--;
		}
		System.out.println();
		System.out.println("Half sorted array : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}