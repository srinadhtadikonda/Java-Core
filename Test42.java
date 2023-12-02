import java.util.Scanner;
public class Test42
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int n,i,s=0,c=0;
		Scanner SC=new Scanner(System.in);
	System.out.print("Enter Size of array..:");
	n=SC.nextInt();
	System.out.print("Enter Elements\n");
	for(i=0;i<n;i++)
	{
		a[i]=SC.nextInt();
		c=c+1;
		s=s+a[i];
	}
	System.out.print("Entered Elements are");
	for(i=0;i<n;i++)
	{
		System.out.print("\t"+a[i]);
	}
double av=s/n;
System.out.println();
System.out.println("Count="+c);
System.out.println("Average="+av);
System.out.println("Sum="+s);

}
}




