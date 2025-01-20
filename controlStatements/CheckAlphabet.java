import java.util.Scanner;

public class CheckAlphabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet: ");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
			System.out.print("It is an Alphabte");
		}
		else
		{
			System.out.print("It is not an Alphabte");
		}
	}
}