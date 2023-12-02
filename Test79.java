class Humans
{
	void walk()
	{
		System.out.println("Human walks slowly");
	}
}
class Employee extends Humans
{
	void walk()
	{
		System.out.println("Employee walks speedily");
	}
}
public class Test79 
{
public static void main(String args[])
{
	Employee E=new Employee();
	E.walk();
}
}
