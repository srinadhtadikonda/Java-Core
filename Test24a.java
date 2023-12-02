import java.lang.*;
import java.util.*;
class Test
{
public static void main(String args[])
{
Scanner SC=new Scanner(System.in);
int units;
double amt=0,scharge,fa;
System.out.print("Enter Number of Units..:");
units=SC.nextInt();

if(units<=50)
{
amt=units*0.50;
}

else if(units <= 150)
{
amt = 25 + (units-50)*0.75;
}
else if(units <= 250)
	{
		amt = 100 + (units-150)*1.20;
	}
	else
	{
		amt = 220 + (units-250)*1.50;
	}
scharge=amt*20/100;
fa=amt+scharge;
System.out.println("Amount="+amt);
System.out.println("Surcharge="+scharge);
System.out.println("Final Amount="+fa);
}
}

