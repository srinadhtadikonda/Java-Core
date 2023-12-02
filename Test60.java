
class BirdsFour              //class
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
public class Test60
{
	public static void main(String args[])
	{
	 BirdsFour Parrot=new BirdsFour();   //Object Parrot instantiated from the class Bird
	 Parrot.age=5;
	 Parrot.wings=2;
	 Parrot.weight=4.5;
	 Parrot.color="Green";
	 System.out.println("Age of Parrot="+Parrot.age);
	 System.out.println("wings of Parrot="+Parrot.wings);
	 System.out.println("Weight of Parrot="+Parrot.weight);
	 System.out.println("Color of Parrot="+Parrot.color);
	 
		Parrot.fly();
		Parrot.sing();
		System.out.println("---------------------------");
		 BirdsFour Pigeon=new BirdsFour();   //Object Pigeon instantiated from the class Bird
		 Pigeon.age=7;
		 Pigeon.wings=2;
		 Pigeon.weight=2.5;
		 Pigeon.color="Green";
		 System.out.println("Age of Pigeon="+Pigeon.age);
		 System.out.println("wings of Pigeon="+Pigeon.wings);
		 System.out.println("Weight of Pigeon="+Pigeon.weight);
		 System.out.println("Color of Pigeon="+Pigeon.color);
		 
			Pigeon.fly();
			Pigeon.sing();
			System.out.println("---------------------------");
			}

}
