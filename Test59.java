
class BirdsThree               //class
{
	int age;
	int wings;
	String color;
	double weight;
	void fly()               //method
	{
		System.out.println("they fly to fulfill natural activities");
	}
	void sing()                  //methods
	{
		System.out.println("Bird sing");
	}
}
public class Test59{
	public static void main(String args[])
	{
	 BirdsThree Parrot=new BirdsThree();   //Object Parrot instantiated from the class Bird
	 Parrot.age=5;
	 Parrot.wings=3;
	 Parrot.weight=4.5;
	 Parrot.color="Green";
	 System.out.println("Age of Parrot="+Parrot.age);
	 System.out.println("wings of Parrot="+Parrot.wings);
	 System.out.println("Weight of Parrot="+Parrot.weight);
	 System.out.println("Color of Parrot="+Parrot.color);
	 
		Parrot.fly();
		Parrot.sing();
		System.out.println("---------------------------");
			}

}
