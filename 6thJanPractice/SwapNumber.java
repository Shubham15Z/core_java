public class SwapNumber
{
	public static void main(String args[])
	{
		int a = 50;
		int b = 80;
		System.out.println("Before swapping \n a = "+a+" b = "+b);

		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping \n a = "+a+" b = "+b);

	}
}