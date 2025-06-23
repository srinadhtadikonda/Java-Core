package corejavaprograms;
import java.lang.*;
class MyCalci
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
class Test25
{
	public static void main(String args[])
	{
		MyCalci MC=new MyCalci();
		MC.a=1;
		MC.b=2;
		MC.c=3;
		System.out.println("Sum="+MC.mySum());
		System.out.println("Sum="+MC.mySum(10,20));
		System.out.println("Sum="+MC.mySum(5,7,9));	
	}
}
