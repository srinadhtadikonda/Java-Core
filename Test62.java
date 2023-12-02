class MyCalci1
{
	int a;
	int b;
	
	void putvals()
	{
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
	int mySum()
	{
		return a+b;
	}
}
class Test62
{
	public static void main(String args[])
	{
		MyCalci1 MC=new MyCalci1();
		MC.a=5;
		MC.b=3;
		MC.putvals();
		System.out.println("Sum="+MC.mySum());
	}
}