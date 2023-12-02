public class Test81 
{
public static void main(String args[])
{
int a=100,b=2,c;
try
{
System.out.println("Begin");
System.out.println("Ready To Division");
c=a/b;
System.out.println("Result="+c);
System.out.println("Division Done");
System.out.println("End");
}catch(ArithmeticException ex)
{
ex.getMessage();
}
finally
{
	System.out.println("Execution Completed");
}
}
}