package corejavaprograms;

public class MyCalci 
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
public static void main(String args[])
{
	MyCalci MC=new MyCalci();
	MC.a=10;
	MC.b=20;
	MC.c=30;
	System.out.println("Sum="+MC.mySum());
	System.out.println("Sum="+MC.mySum(100,150));
	System.out.println("Sum="+MC.mySum(5,7,9));
}

	
	
	
}
