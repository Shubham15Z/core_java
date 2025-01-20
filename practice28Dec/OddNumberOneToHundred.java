import java.util.Scanner;

public class OddNumberOneToHundred
{
	public static void main(String[] arg)
	{
		int i = 1;
		System.out.println("Odd numbers from 1 to 100 are:");

		while(i<=100)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}