import java.lang.*;
class Main implements Runnable
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
Main T=new Main();
Thread TH=new Thread(T);
TH.start();
}
}
