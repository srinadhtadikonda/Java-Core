//program to create  a text file

import java.io.*;  
class File01{  
  public static void main(String args[]){  
   try{  
     FileOutputStream fout=new FileOutputStream("abc.txt");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }catch(Exception e)
{
System.out.println(e);}  
  }  
}  
