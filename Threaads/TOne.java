import java.lang.*;
class TOne extends Thread
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
TOne T=new TOne();
T.start();
}
}
