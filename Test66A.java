class Main
{
	int a;
	int b;
Main(int a,int b)
	{
		this.a=a;
		this.b=b;
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
public static void main(String args[])
{
Main MC1=new Main(1,2);
	MC1.dispvals();
	System.out.println("Sum="+MC1.mySum());
}
}
