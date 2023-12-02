import java.util.Scanner;
public class Test43
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int n,i,max,min;
		Scanner SC=new Scanner(System.in);
	System.out.print("Enter Size of array..:");
	n=SC.nextInt();
	System.out.print("Enter Elements\n");
	for(i=0;i<n;i++)
	{
		a[i]=SC.nextInt();
		
	}
	
	max=a[0];
	min=a[0];
	System.out.print("Entered Elements are");
	for(i=0;i<n;i++)
	{
		System.out.print("\t"+a[i]);
		if(a[i]>max)
		{
			max=a[i];
		}
		else if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println();
System.out.println("Max="+max);
System.out.println("Min="+min);
	}
}



