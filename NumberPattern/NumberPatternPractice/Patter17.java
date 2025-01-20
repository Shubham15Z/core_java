/*
        1
      3 5 7
   9 11 13 15 17
19 21 23 25 27 29 31


*/

public class Patter17
{
	public static void main(String arg[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print("*")
			}
		}
	}
}