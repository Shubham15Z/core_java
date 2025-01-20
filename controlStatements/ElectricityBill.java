import java.util.Scanner;

public class ElectircityBill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units electricity cunsumed:");
		int eu = sc.nextInt();
		int eBill;
		if(eu <= 50)
		{
			eBill = eu*0.5;
			totalEleBill = eBill + eBill*0.2;
		}
		else if(eu)
		{
			p = (cp-sp)/cp*100;
			System.out.println("Loss: "+l+"%");
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
	}
}