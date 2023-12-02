import java.util.Scanner;
public class Test22
{
public static void main(String args[])
{
	int age;
	Scanner SC=new Scanner(System.in);
	System.out.print("Enter value x..:");
	age=SC.nextInt();
	if(age>=65)
{
		System.out.println("Senior Citizen");
		System.out.println("Eligible TO Vote");
}
	else if(age<65 && age>=18)
	{
		System.out.println("Major Citizen");
		System.out.println("Eligible TO Vote");
		
	}
	else if(age<18)
	{
			System.out.println("Minor Citizen");
			System.out.println("Not Eligible TO Vote");
	}
}
	}