class Variable 
{
	int a;
	boolean b;
	byte c;
	short d;
	long e;
	float f;
	double g;
	char h;
	public static void main(String arg[])
	{
		
		Variable obj = new Variable();

		System.out.println("Default value of int a is: "+obj.a);
		System.out.println("Default value of boolean b is: "+obj.b);
		System.out.println("Default value of byte c is: "+obj.c);
		System.out.println("Default value of short d is: "+obj.d);
		System.out.println("Default value of long e is: "+obj.e);
		System.out.println("Default value of float f is: "+obj.f);
		System.out.println("Default value of double e is: "+obj.e);
		System.out.println("Default value of char h is: "+obj.h);
	}
}