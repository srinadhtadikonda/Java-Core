interface AA
{
	void greeta();
}
interface BB
{
	void greetb();
}
class NCT implements AA,BB
{
	public void greeta()
	{
		System.out.println("How are you");
	}
	public void greetb()
	{
		System.out.println("Hai");
	}
	
}
public class Test77 
{
public static void main(String args[])
{
	NCT T=new NCT();
	T.greeta();
	T.greetb();
	
}
}
