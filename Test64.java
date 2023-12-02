import java.util.*;
class MyCalci4
{
	Scanner SC=new Scanner(System.in);
	int a;
	int b;
	void getVals()
	{
		System.out.print("Enter a..");
		a=SC.nextInt();
		System.out.print("Enter b..");
		b=SC.nextInt();
	}
	void putVals()
	{
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
	int mySum()
	{
		return a+b;
	}
}

public class Test64 
{
public static void main(String args[])
{
	MyCalci4 MC4=new MyCalci4();
	MC4.getVals();
	MC4.putVals();
	System.out.println("Sum="+MC4.mySum());
}
}
