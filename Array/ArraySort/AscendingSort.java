public class AscendingSort
{
	public static void main(String arg [])
	{
		int a[] = {15, 12, 5, 8, 4, 2, 3, 7};

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

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*
for i = 1 1st a[0] = 15, 
for j = 1 1st a[1] = 12
check a[0] > a[1] true
swap the number
array becomes 12, 15, 5, 8, 4, 2, 3, 7

j++ j = 2
a[0] = 12
a[j] = a[2] = 5
check condition a[0] 12 > a[2] 5 true
swap the number
array becomes 5, 15, 12, 8, 4, 2, 3, 7

j++ j = 3
a[0] = 5
a[j] = a[3] = 8
check condition 5 > 8 false
no swapping
array remains same 5, 15, 12, 8, 4, 2, 3, 7

j++ j = 4
a[0] = 5
a[4] = 4
check condition 5 > 4 true
swap the numbers
array becomes 4, 15, 12, 8, 5, 2, 3, 7

j++ j = 5
a[0] = 4
a[5] = 2
check condition 4 > 2 true
swap the numbers 
array becomes 2, 15, 12, 8, 5, 4, 3, 7

j++ j = 6
a[0] = 2
a[6] = 3
check condition 2 > 3 false
no swapping 
array becomes 2, 15, 12, 8, 5, 4, 3, 7

j++ j = 7
a[0] = 2
a[7] = 7
check condition 2 > 7 false
no swapping 
array becomes 2, 15, 12, 8, 5, 4, 3, 7

by the end of 1st iteration for i = 0 we have stored the samllest element at 0 index
similarly we can perform for the remaininig smaller elements to shift to the left.

 */