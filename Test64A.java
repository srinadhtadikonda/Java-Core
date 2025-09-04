package corejavaprograms;
import java.lang.*;
import java.util.*;
import java.math.*;
class MyCalci
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
	void putvals()
	{
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
	int mysum()
	{
		return a+b;
	}
	int mysub()
	{
		return a-b;
	}
	int mymul()
	{
		return a*b;
	}
	
	int mydiv()
	{
		return a/b;
	}
	int mymod()
	{
		return a%b;
	}
	int myexp()
	{
		return (int) Math.pow(a,b);
	}
	}


public class Casio 
{
public static void main(String args[])
{
MyCalci MC=new MyCalci(); 
Scanner SC=new Scanner(System.in);
MC.getVals();
MC.putvals();
System.out.println("---------------------------------------------");
System.out.println("\t\tMENU");
System.out.println("---------------------------------------------");
System.out.println("1 ADDITION");
System.out.println("2 SUBTRACTION");
System.out.println("3 MULTIPLICATION");
System.out.println("4 DIVISION");
System.out.println("5 MODULUS");
System.out.println("6 EXPONENTIATION");
System.out.println("---------------------------------------------");
System.out.print("Enter Your Choice 1/2/3/4/5/6...:");
int i=SC.nextInt();
switch(i)
{
case 1:
	System.out.println("Sum="+MC.mysum());
	break;
case 2:
	System.out.println("Sub="+MC.mysub());
	break;
case 3:
	System.out.println("Mul"+MC.mymul());
	break;
case 4:
	System.out.println("Div="+MC.mydiv());
	break;
case 5:
	System.out.println("Mod="+MC.mymod());
	break;
case 6:
    System.out.println("Exp=" + MC.myexp());
    break;
    
default:
	System.out.println("Invalid Choice");
}
}
}
