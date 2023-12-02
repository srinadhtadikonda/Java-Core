class Books
{
	int bno;
	String bname;
	double bprice;
	Books()
	{
		bno=101;
		bname="Unix";
		bprice=456.75;
	}
	void dispvals()
	{
		System.out.println("Bno="+bno+"\t"+"Bname="+bname+"\t"+"Bprice="+bprice);
	}
}
public class Test68 
{
public static void main(String args[])
{
	Books B=new Books();
	B.dispvals();
}
}
