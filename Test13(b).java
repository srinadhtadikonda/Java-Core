package corejavaprograms;
import java.lang.*;
import java.io.*;
class Test04
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int sno,sclass,m1,m2,m3,m4,m5,m6,tot;
String sname;
String ssec;
double avg;
System.out.print("Enter Sno..:");
sno=Integer.parseInt(br.readLine());
System.out.print("Enter Sname..:");
sname=br.readLine();
System.out.print("Enter Sclass..:");
sclass=Integer.parseInt(br.readLine());
System.out.print("Enter Ssec..:");
ssec=br.readLine();
System.out.print("Enter M1..:");
m1=Integer.parseInt(br.readLine());
System.out.print("Enter M2..:");
m2=Integer.parseInt(br.readLine());
System.out.print("Enter M3..:");
m3=Integer.parseInt(br.readLine());
System.out.print("Enter M4..:");
m4=Integer.parseInt(br.readLine());
System.out.print("Enter M5..:");
m5=Integer.parseInt(br.readLine());
System.out.print("Enter M6..:");
m6=Integer.parseInt(br.readLine());

tot=m1+m2+m3+m4+m5+m6;
avg=tot/6;
System.out.println("---------------------------------------------------");
System.out.println("MARKS REPORT");
System.out.println("---------------------------------------------------");
System.out.println("Sno="+sno+"\t"+"Sname="+sname);
System.out.println("Sclass="+sclass+"\t"+"Ssec="+ssec);
System.out.println("*****************************");
System.out.println("M2="+m1+"\t"+"M2="+m2);
System.out.println("M2="+m3+"\t"+"M2="+m4);
System.out.println("M5="+m5+"\t"+"M6="+m6);
System.out.println("*****************************");
System.out.println("Total="+tot);
System.out.println("Average="+avg);
System.out.println("*****************************");
}
}
