package corejavaprograms;
class Books
{
int bno;
String bname;
float bprice;
void bdet()
{
System.out.println("Book No:"+bno);
System.out.println("Book Name:"+bname);
System.out.println("Book Price:"+bprice);
}
void bdet(int bn,String bna)
{
bno=bn;
bname=bna;
System.out.println("Book No:"+bno);
System.out.println("Book Name:"+bname);
}
void bdet(int bn,String bna,float bp)
{
bno=bn;
bname=bna;
bprice=bp;
System.out.println("Book No:"+bno);
System.out.println("Book Name:"+bname);
System.out.println("Book Price:"+bp);
}
}
class Test25
{
public static void main(String args[])
{
Books B =new Books();
B.bno=1;
B.bname="Java";
B.bprice=345.75f;
B.bdet();
B.bdet(2,"Unix");
B.bdet(3,"Python",456.85f);
}
}


