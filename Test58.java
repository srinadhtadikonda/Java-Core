
class Birds                   //class
{
	void fly()               //method
	{
		System.out.println("they fly to fulfill natural activities");
	}
}
public class Test58
{
	public static void main(String args[])
	{
		Birds Parrot=new Birds();   //Object Parrot instantiated from the class Bird
		Parrot.fly();
		System.out.println("---------------------------");
		Birds Pigeon=new Birds();
		Pigeon.fly();
	}

}
