import java.util.*;
public class Test55 
{
	public static void main(String args[])
	{
String s="State Bank Of India";
StringTokenizer st=new StringTokenizer(s);
while(st.hasMoreTokens())
{
	System.out.println(st.nextToken());
}
}
}