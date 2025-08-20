/* program to  Check Number is Prime or not*/
package corejavaprograms;
import java.util.*;
public class Test31
{
	public static void main(String args[])
	{
		int n=11,i;
		boolean isprime=true;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
			break;
		}
	}
	
	if(isprime)
		{
		System.out.println("Number is Prime");	
		}
	else
	{
		
		System.out.println("Number is Not Prime");	
}
}
}
