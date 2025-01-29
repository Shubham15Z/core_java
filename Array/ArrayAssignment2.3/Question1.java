/* 
Q1.Given an array and a number K where K is smaller than the size of the 
array. Find the K’th smallest element in the given array. Given that 
all array elements are distinct.
Examples:  
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7

*/
public class Question1
{
	public static void main(String arg[])
	{
		int a[] = {7, 10, 4, 3, 20, 15,25,6,5};
		int k = 3;

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
			if(i == k-1)
			{
				System.out.print("K th smallest element is : "+a[i]);
				break;
			}
		}
	}

}