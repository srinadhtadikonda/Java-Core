import java.util.Scanner;
public class Test26
{
public static void main(String args[])
{
	int i;
	Scanner SC=new Scanner(System.in);
	System.out.println("Enter i value");
	i=SC.nextInt();
	switch(i)
	{
	case 1:
	{
		System.out.println("Good");
		break;
	}
	case 2:
	{
		System.out.println("Better");
		break;
	}
	case 3:
	{
		System.out.println("Best");
		break;
	}
	default:
	{
		System.out.println("Invalid");
	}
}
}
}