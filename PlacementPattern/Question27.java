/*
27. Print a wave pattern with numbers and stars.

1*2*3*4*5
*6*7*8*9
10*11*12*
*13*14*15
16*17*18*19*20
*/

public class Question27
{
	public static void main(String arg[])
	{	/*
		int n = 1;
		for(int i = 1; i <= 5; i++)
		{
			if(i%2 != 0)
			{
				for(int j = 1; j <= 5; j++)
				{
					System.out.print(n);
					n++;
					if(j < 5)
					{
						System.out.print("*");
					}
				}
			}
			else
			{
				for(int j = 1; j <= 5; j++)
				{
					System.out.print("*");
					if(j>1)
					{
						System.out.print(n);
						n++;	
					}
				}
			}
			System.out.println();
		}
		*/
		
		 int rows = 5;
        int num = 1;
        
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Even row: Print number first
                for (int j = 0; j < 5 - i % 2; j++) {
                    System.out.print(num++);
                    if (j < 4 - i % 2) System.out.print("*");
                }
            } else { // Odd row: Print * first
                System.out.print("*");
                for (int j = 0; j < 4; j++) {
                    System.out.print(num++);
                    if (j < 3) System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}