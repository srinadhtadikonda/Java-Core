class IceCream
{
	int price;
	int quantity;
	double weight;
	String color;
	void melt()
	{
		System.out.println("It Melta at room temperature");
	}
	int billAmount()
	{
		return price*quantity;
	}
}
public class Test63 
{
public static void main(String args[])
{
	IceCream Vanilla=new IceCream();
	Vanilla.price=20;
	Vanilla.quantity=500;
	Vanilla.weight=45.5;
	Vanilla.color="white";
	System.out.println("Price of vanilla="+Vanilla.price);
	System.out.println("Quantity of vanilla="+Vanilla.quantity);
	System.out.println("Weight of vanilla="+Vanilla.weight);
	System.out.println("Color of vanilla="+Vanilla.color);
	System.out.println("Billl Amount of vanilla="+Vanilla.billAmount());
	System.out.println("------------------------");
	IceCream Pista=new IceCream();
	Pista.price=45;
	Pista.quantity=500;
	Pista.weight=45.5;
	Pista.color="GREEN";
	System.out.println("Price of Pista="+Pista.price);
	System.out.println("Quantity of Pista="+Pista.quantity);
	System.out.println("Weight of Pista="+Pista.weight);
	System.out.println("Color of Pista="+Pista.color);
	System.out.println("Billl Amount of Pista="+Pista.billAmount());
	
}
}
