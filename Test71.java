class MyCalci11
{
	int a;
	int b;
	MyCalci11(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void dispvals()
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
}
public class Test71 
{
public static void main(String args[])
{
	MyCalci11 MC11=new MyCalci11(20,10);
	MC11.dispvals();
}
}
