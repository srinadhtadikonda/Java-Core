package myjavacodes;
import java.lang.*;
import java.io.*;
public class Test23
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String ecode;
int eno;
String ename;
double esal;
float epf;
char egrade;
boolean ews;

System.out.print("Enter Employee Code..:");
ecode=br.readLine();

System.out.print("Enter Eno...:");
eno=Integer.parseInt(br.readLine());

System.out.print("Enter Employee Ename..:");
ename=br.readLine();

System.out.print("Enter Employee Salary..:");
esal=Double.parseDouble(br.readLine());

System.out.print("Enter Employee Provident Fund..:");
epf=Float.parseFloat(br.readLine());

System.out.print("Enter Employee Grade..:");
egrade=br.readLine().charAt(0);

System.out.print("Enter Employee Wroking Status..:");
ews=Boolean.parseBoolean(br.readLine());

System.out.println("----------------------------------");
System.out.println("Employee Data");
System.out.println("----------------------------------");
System.out.println("Code="+ecode);
System.out.println("Number="+eno);
System.out.println("Name="+ename);
System.out.println("Salary="+esal);
System.out.println("Provident Fund="+epf);
System.out.println("Grade="+egrade);
System.out.println("Work Status="+ews);
System.out.println("----------------------------------");
}
}
