class MyCalci
{
	int a;
	int b;
	int mySum()
	{
		return a+b;
	}
}
class Test61
{
	public static void main(String args[])
	{
		MyCalci MC=new MyCalci();
		MC.a=5;
		MC.b=3;
		System.out.println("Value of a="+MC.a);
		System.out.println("Value of b="+MC.b);
		System.out.println("Sum="+MC.mySum());
	}
}