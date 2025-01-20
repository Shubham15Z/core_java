import java.util.Scanner;

public class NumberOfNotes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		int amt = sc.nextInt();
		int n500, n200, n100, n50,  n10;
		n500 = n200 = n100 = n50 =  n10 = 0;

		if(amt>=500)
		{
			n500 = amt/500;
			amt = amt%500;
		};
		if(amt>=200)
		{
			n200 = amt/200;
			amt = amt%200;
		};
		if(amt>=100)
		{
			n100 = amt/100;
			amt = amt%100;
		};
		if(amt>=50)
		{
			n50 = amt/50;
			amt = amt%50;
		};
		if(amt>=10)
		{
			n10 = amt/10;
			amt = amt%10;
		};
		System.out.println("Total Number of Notes");
		System.out.println("500 = "+ n500);
		System.out.println("200 = "+ n200);
		System.out.println("100 = "+ n100);
		System.out.println("50 = "+ n50);
		System.out.println("10 = "+ n10);
	}
}