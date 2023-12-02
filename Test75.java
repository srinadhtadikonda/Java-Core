class A1
{
	void methoda()
	{
		System.out.println("Method of class A");
	}
}
class B1 extends A1
{
	void methodb()
	{
		System.out.println("Mehstod of class B");
	}
}

class C1 extends B1
{
	void methodc()
	{
		System.out.println("Mehstod of class C");
	}
}
public class Test75
{
public static void main(String args[])
{
	B1 objB=new B1();
	objB.methoda();
	objB.methodb();
	
	C1 objC=new C1();
	objC.methoda();
	objC.methodb();
	objC.methodc();
	
}
}
