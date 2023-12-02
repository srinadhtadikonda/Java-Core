class Books1
{
	int bno;
	String bname;
	double bprice;
	Books1()
	{
		bno=101;
		bname="Unix";
		bprice=456.75;
	}
	void dispvalsone()
	{
		System.out.println("Bno="+bno+"\t"+"Bname="+bname+"\t"+"Bprice="+bprice);
	}
	Books1(int bn,String bna)
	{
		bno=bn;
		bname=bna;
	
	}
	void dispvalstwo()
	{
		System.out.println("Bno="+bno+"\t"+"Bname="+bname);
	}
	Books1(int bn,String bna,double bp)
	{
		bno=bn;
		bname=bna;
	    bprice=bp;
	}
	void dispvalsthree()
	{
		System.out.println("Bno="+bno+"\t"+"Bname="+bname+"\t"+"Bprice="+bprice);
	}
	
}
public class Test69
{
public static void main(String args[])
{
	Books1 B1=new Books1();
	Books1 B2=new Books1(102,"windows");
	Books1 B3=new Books1(103,"macos",344.75);
	B1.dispvalsone();
	B2.dispvalstwo();
	B3.dispvalsthree();
}
}