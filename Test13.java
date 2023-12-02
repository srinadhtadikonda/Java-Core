import java.io.*;
public class Test13 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int eno;
String ename;
double esal;
float epf;
char egrade;
System.out.print("Enter Eno..:");
eno=Integer.parseInt(br.readLine());

System.out.print("Enter Ename..:");
ename=br.readLine();

System.out.print("Enter Esal..:");
esal=Double.parseDouble(br.readLine());

System.out.print("Enter Epf..:");
epf=Float.parseFloat(br.readLine());


System.out.print("Enter Epf..:");
egrade=(char)br.read();

System.out.println("-------------------------------------");
System.out.println("Eno="+eno);
System.out.println("Ename="+ename);
System.out.println("Esal="+esal);
System.out.println("Epf="+epf);
System.out.println("Egrade="+egrade);

}
}
