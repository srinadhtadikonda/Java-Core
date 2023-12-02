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
		System.out.println("Mehtod of class B");
	}
}
public class Test74 
{
public static void main(String args[])
{
	B objB=new B();
	objB.methoda();
	objB.methodb();
	
}
}
