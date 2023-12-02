class MyCalci7
{
	int a;
	int b;
	MyCalci7()
	{
		a=5;
		b=3;
	}
	void dispvals()
	{
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
	int mySum()
	{
		return a+b;
	}
}
public class Test65 
{
public static void main(String args[])
{
	MyCalci7 MC=new MyCalci7();
	MC.dispvals();
	System.out.println("Sum="+MC.mySum());
}
}
