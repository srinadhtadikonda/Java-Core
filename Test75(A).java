package corejavaprograms;

class A
{
	void methoda()
	{
		System.out.println("Method of class A");
	}
}
class B extends A
{
	void methodb()
	{
		System.out.println("Mehstod of class B");
	}
}

class C extends A
{
	void methodc()
	{
		System.out.println("Mehstod of class C");
	}
}
	class D extends A
	{
		void methodd()
		{
			System.out.println("Mehstod of class D");
		}	
}
public class Test75A
{
public static void main(String args[])
{
	B objB=new B();
	objB.methoda();
	objB.methodb();
	
	C objC=new C();
	objC.methoda();
	objC.methodc();

	
	D objD=new D();
	objD.methoda();
	objD.methodd();
	
}
}

