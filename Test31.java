import java.util.*;
public class Test31
{
public static void main(String args[])
{
	int a,b,c;
	char ch;
	Scanner SC=new Scanner(System.in);
	do
	{
		System.out.print("Enter a..:");
		a=SC.nextInt();
		System.out.print("Enter b..:");
		b=SC.nextInt();
		c=a+b;
		System.out.println("Sum="+c);
		
		System.out.print("Do You Want To Sum More(Y/N)..:");
		ch=SC.next().charAt(0);
	}while(ch=='y'||ch=='Y');
}
}