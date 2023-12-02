import java.util.Scanner;
public class Test19
{
	public static void main(String args[])
	{
		int a,b;
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a..:");
		a=SC.nextInt();
		System.out.print("Enter b..:");
		b=SC.nextInt();
		if(a>b)
		{
			System.out.println("a is big");
		}
		else if(a<b)
		{
			System.out.println("b is big");
		}
		else if(a==b)
		{
			System.out.println("both are equal");
		}
	}

}
