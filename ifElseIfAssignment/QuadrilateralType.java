import java.util.Scanner;

public class QuadrilateralType
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of side 1: ");
        	int side1 = sc.nextInt();
        	System.out.print("Enter the length of side 2: ");
      		int side2 = sc.nextInt();
        	System.out.print("Enter the length of side 3: ");
        	int side3 = sc.nextInt();
        	System.out.print("Enter the length of side 4: ");
        	int side4 = sc.nextInt();

        
        	System.out.print("Enter the first angle: ");
        	int angle1 = sc.nextInt();
        	System.out.print("Enter the second angle: ");
        	int angle2 = sc.nextInt();
        	System.out.print("Enter the third angle: ");
        	int angle3 = sc.nextInt();
        	System.out.print("Enter the fourth angle: ");
        	int angle4 = sc.nextInt();

        	if (angle1 + angle2 + angle3 + angle4 != 360) 
		{
            		System.out.println("The angles do not form a quadrilateral.");
        	} 	
		else if (side1 == side2 && side2 == side3 && side3 == side4 && 
                   	 angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90) 
		{
            		System.out.println("The quadrilateral is a Square.");
        	} 
		else if ((side1 == side3 && side2 == side4) && 
                   	(angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90)) 
		{
            		System.out.println("The quadrilateral is a Rectangle.");
        	} 
		else if (side1 == side3 && side2 == side4 && angle1 == angle3 && angle2 == angle4)
		{
           		System.out.println("The quadrilateral is a Parallelogram.");
        	} 
		else if (side1 == side3 || side2 == side4) 
		{
            		System.out.println("The quadrilateral is a Trapezoid.");
        	} 
		else 
		{
            		System.out.println("The quadrilateral is of another type.");
        	}
		
	}
}