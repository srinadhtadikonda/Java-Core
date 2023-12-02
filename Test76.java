class A2
{
	void methoda()
	{
		System.out.println("Method of class A");
	}
}
class B2 extends A2
{
	void methodb()
	{
		System.out.println("Mehstod of class B");
	}
}

class C2 extends A2
{
	void methodc()
	{
		System.out.println("Mehstod of class C");
	}
}
class D2 extends A2
{
	void methodd()
	{
		System.out.println("Mehstod of class C");
	}
}
public class Test76
{
public static void main(String args[])
{
	B2 objB=new B2();
	objB.methoda();
	objB.methodb();

	C2 objC=new C2();
	objC.methoda();
	objC.methodc();

	
	D2 objD=new D2();
	objD.methoda();
	objD.methodd();

	
	
}
}
