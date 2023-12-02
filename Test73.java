import java.lang.* ;
class Emp
{
    int eno;
    String ename;
    double esal;
    char egrade;
    Emp(int eno,String ename,double esal,char egrade)
    {
        this.eno=eno;
        this.ename=ename;
        this.esal=esal;
        this.egrade=egrade;
    }
}
class Dept extends Emp 
{
    int deptno;
    String deptname;
    
    Dept(int eno,String ename,double esal,char egrade,int deptno,String deptname)
    {
    super(eno,ename,esal,egrade);
        this.deptno=deptno;
        this.deptname=deptname;
    }
    void dispVals()
    {
        System.out.println("Eno="+eno+"\t"+"Ename"+ename+"\t"+"Esal="+esal+"Egrade="+egrade+"\t"+"Deptno="+deptno+"\t"+"Deptname="+deptname);
    }
}
class Main 
{
    public static void main(String args[])
    {
        Dept D=new Dept(101,"Anil",45567.75,'A',1,"Manager");
        D.dispVals();
    }
    
}
