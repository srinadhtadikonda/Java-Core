class Bird8
{
	static int count=100;
	int age;
	int wings;
	double weight;
	String color;
	static void sing()
	{
		System.out.println("Some Birds can sing");
	}
	void fly()
	{
		System.out.println("they fly");
	}
}
public class Test70 
{
public static void main(String args[])
{
	Bird8.count=5;
	System.out.println("Count of Birds"+Bird8.count);
	Bird8.sing();
}
}
