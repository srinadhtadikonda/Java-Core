class MyCalci8
{
	int a;
	int b;
	MyCalci8(int x,int y)
	{
		a=x;
		b=y;
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
public class Test66 
{
public static void main(String args[])
{
	MyCalci8 MC1=new MyCalci8(1,2);
	MC1.dispvals();
	System.out.println("Sum="+MC1.mySum());
	
	MyCalci8 MC2=new MyCalci8(11,12);
	MC2.dispvals();
	System.out.println("Sum="+MC2.mySum());
}
}
