class MyCalci12
{
	int a;
	int b;
	int c;
	int mySum()
	{
		return a+b+c;
	}
	int mySum(int x,int y)
	{
		a=x;
		b=y;
		return x+y;
	}
	int mySum(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		return x+y+z;
	}

}
public class Test72 
{
public static void main(String args[])
{
	MyCalci12 MC1=new MyCalci12();
	MC1.a=5;
	MC1.b=10;
	MC1.c=15;
	System.out.println("Sum="+MC1.mySum());
	System.out.println("Sum="+MC1.mySum(1,2));
	System.out.println("Sum="+MC1.mySum(1,2,3));
}
}
