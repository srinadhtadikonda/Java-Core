package corejavaprograms;
import java.lang.*;
import java.io.*;
public class Test 
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i=2,f=0;
System.out.print("Enter a number..:");
n=Integer.parseInt(br.readLine());
if(n<=1)
{
	System.out.println("not a prime");
	return;
}
while(i<=n/2)
{
	if(n%i==0)
	{
		f++;
	}
	i++;
}
	if(f>1)
	{
		System.out.println("not a prime");
	}
	else
	{
		System.out.println("Prime Number");
	}
}
}
