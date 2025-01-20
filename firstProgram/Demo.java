class Demo 
{
	int b=5; //instance or global variable
	static int c = 10;

	public static void main(String arg[])
	{
		int a = 30; // local variable
		Demo obj = new Demo();

		System.out.println("local variable a : "+a);
		System.out.println("static variable c : "+c);
		System.out.println("global variable: b : "+obj.b);
		System.out.println("Hello Java");
	}
}