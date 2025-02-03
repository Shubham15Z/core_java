/*4.Write a Java program to replace each element of the array with product
of every other element in a given array of integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]
*/

public class Question4
{
	public static void main(String arg[])
	{
		//int nums1[] = { 1, 2, 3, 4, 5, 6, 7};
		//int nums2[] = {0, 1, 2, 3, 4, 5, 6, 7};
		//int product = 1;
		//int zeroCount = 0;

		//int a[] = {1,2,3,4,5,6,7};
		int a[] = {0,1,2,3,4,5,6,7};
		int b[] = new int [a.length];
		for(int i = 0; i < a.length; i++)
		{
			int product = 1;
			for(int j = 0; j < a.length; j++)
			{
				if(i == j)
				{
					continue;
				}
				else
				{
					product = product * a[j];
				}
			}
			b[i] = product;
		}

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(b[i]+" ");
		}

		/*
		for(int i = 0; i < nums1.length; i++)
		{
			if(nums1[i] != 0)
			{
				product = product * nums1[i];
			}
			else
			{
				zeroCount++;
			}
		}

		int nums3[] = new int [nums1.length];
		for(int i = 0; i < nums3.length; i++)
		{
			if(zeroCount > 1)
			{
				nums3[i] = 0;
			}
			else if(zeroCount == 1)
			{
				if(nums1[i] == 0)
				{
					nums3[i] = product;
				}
				else
				{
					nums3[i] = 0;
				}
			}
			else
			{
				nums3[i] = product/nums1[i];
			}
		} 
		*/
		/*
		for(int i = 0; i < nums2.length; i++)
		{
			if(nums2[i] != 0)
			{
				product = product * nums2[i];
			}
			else
			{
				zeroCount++;
			}
		}

		int nums3[] = new int [nums2.length];
		for(int i = 0; i < nums3.length; i++)
		{
			if(zeroCount > 1)
			{
				nums3[i] = 0;
			}
			else if(zeroCount == 1)
			{
				if(nums2[i] == 0)
				{
					nums3[i] = product;
				}
				else
				{
					nums3[i] = 0;
				}
			}
			else
			{
				nums3[i] = product/nums2[i];
			}
		}
			
			

		System.out.println("Elements in array after product with every other element except itself : ");
		for(int i = 0; i < nums3.length; i++)
		{
			System.out.print(nums3[i]+" ");
		}
		*/	
	}
}
