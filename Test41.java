import java.util.*;
public class Test41
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int n,i;
		Scanner SC=new Scanner(System.in);
	System.out.print("Enter Size of array..:");
	n=SC.nextInt();
	System.out.print("Enter Elements\n");
	for(i=0;i<n;i++)
	{
		a[i]=SC.nextInt();
	}
	System.out.print("Entered Elements are");
	for(i=0;i<n;i++)
	{
		System.out.print("\t"+a[i]);
	}
	}
}




