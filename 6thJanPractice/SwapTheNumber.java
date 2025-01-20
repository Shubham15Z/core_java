public class SwapTheNumber
{
	public static void main(String args[])
	{
		int a = 45;
		int b = 25;
		System.out.println("Before swapping \n a = "+a+" b = "+b);
		
		a = a + b; // 70
		b = a - b; // 70 - 25 = 45
		a = a - b; // 70 - 45 = 25
		System.out.println("After swapping \n a = "+a+" b = "+b);
	}
}