import java.util.*;
public class Test21 
{
public static void main(String args[])
{
	int x;
	Scanner SC=new Scanner(System.in);
	System.out.print("Enter value x..:");
	x=SC.nextInt();
	if(x>=0)
		if(x==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Positive");
		}
	else
	{
		System.out.println("Negative");
	}
}
}
