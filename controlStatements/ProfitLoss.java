import java.util.Scanner;

public class ProfitLoss
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price:");
		double cp = sc.nextDouble();
		System.out.println("Enter the Selling Price:");
		double sp = sc.nextDouble();
		double p,l;

		if(sp>cp)
		{
			p = (sp-cp)/cp*100;
			System.out.println("Profit: "+p+"%");
		}
		else if(cp>sp)
		{
			l = (cp-sp)/cp*100;
			System.out.println("Loss: "+l+"%");
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
	}
}