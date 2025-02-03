import java.util.Random;
public class RandomDemo
{
	public static void main(String arg[])
	{
		Random rd = new Random();
		int n1 = rd.nextInt(10);

		System.out.println(n1);
	}
}