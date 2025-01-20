/*
          1
        3 5 7
    9 11 13 15 17
19 21 23 25 27 29 31


for condition in k
k should be 1 for 1st iteration because one value is printing
k should be 3 for 2nd iteration because 3 values printing
k should be 5 for 3rd iteration because 5 values printing
k should be 7 for 4th iteration because 7 values printing



so based on i value we can calculate k as
 k = 2*i - 1
 for i = 1, k = 2*1-1 = 1
 for i = 2, k = 2*2-1 = 3
 for i = 3, k = 2*3-1 = 5
 for i = 4, k = 2*4-1 = 7

*/

public class Pattern17 
{
	public static void main(String arg[])
	{
		int n = 1;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print("  ");
			}
			for(int k = 1; k <= (2*i - 1); k++)
			{
				System.out.print(n+" ");
				n = n+2;
			}
			System.out.println();
		}
	}
}