abstract class Animal
{
	abstract void walk();
}
class Monkey extends Animal
{
	public void walk()
	{
		System.out.println("Monkey walks with 4 legs");
	}
}
class Human extends Animal
{
	public void walk()
	{
		System.out.println("Human walks with 2 legs");
	}
}
class Snake extends Animal
{
	public void walk()
	{
		System.out.println("It Crawls");
	}	
	}
public class Test78 
{
public static void main(String args[])
{
	Human H=new Human();
	Monkey M=new Monkey();
	Snake S=new Snake();
	H.walk();
	M.walk();
	S.walk();
}
}
