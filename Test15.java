import java.util.Scanner;
public class Test15
{
public static void main(String args[])
{
	Scanner SC=new Scanner(System.in);
	int eno;
	String ename;
	double esal;
	float epf;
	char egrade;
	
	System.out.print("Enter Eno..:");
	eno=SC.nextInt();
	
	System.out.print("Enter Ename..:");
	ename=SC.next();
	
	
	System.out.print("Enter Esal..:");
	esal=SC.nextDouble();
	
	
	System.out.print("Enter Epf..:");
	epf=SC.nextFloat();
	
	System.out.print("Enter Egrade..:");
	egrade=SC.next().charAt(0);
	
	
	System.out.println("Eno="+eno);
	System.out.println("Ename="+ename);
	System.out.println("Ename="+esal);
	System.out.println("Esak="+epf);
	System.out.println("Egrade="+egrade);
	
	
}
}
