class MyCalci9
{
	int a;
	int b;
	int c;

	MyCalci9()
	{
	 a=5;
	 b=2;
	 c=1;
	
}
int mySum1()
{
	return a+b+c;
}
MyCalci9(int x,int y)
{
 a=x;
 b=y;
}
int mySum2()
{
return a+b;
}

MyCalci9(int x,int y,int z)
{
 a=x;
 b=y;
 c=z;
}
int mySum3()
{
return a+b+c;
}

}
class Test67
{
	public static void main(String args[])
	{
		MyCalci9 MC1=new MyCalci9();
		System.out.println("Sum="+MC1.mySum1());
		
		MyCalci9 MC2=new MyCalci9(4,8);
		System.out.println("Sum="+MC2.mySum1());
		
		MyCalci9 MC3=new MyCalci9(4,8,11);
		System.out.println("Sum="+MC3.mySum3());
		
		
	}
}