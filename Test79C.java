package corejavaprograms;

public class Books 
{
int bno;
String bname;
double bprice;

void bOneDet()
{
	System.out.println("Bno="+bno+"\t"+"Bname="+bname+"\t"+"Bprice="+bprice);
}

void bTwoDet(int bn,String bna)
{
	bno=bn;
	bname=bna;
	System.out.println("Bno="+bno+"\t"+"Bname="+bname);
}

void bThreeDet(int bn,String bna,double bp)
{
	bno=bn;
	bname=bna;
	bprice=bp;
	System.out.println("Bno="+bno+"\t"+"Bname="+bname+"\t"+"Bprice="+bp);
}
public static void main(String args[])
{
	Books B=new Books();
	B.bno=101;
	B.bname="Python";
	B.bprice=456.75;
	B.bOneDet();
	B.bTwoDet(102,"Java");
	B.bThreeDet(103,"Unix",456.86);
}
}
