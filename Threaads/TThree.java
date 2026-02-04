import java.lang.*;
class TThree extends Thread
{
public void run()
{
System.out.println("Thread is running"+Thread.currentThread());
}
}
class Main 
{
public static void main(String args[])
{
TThree T1=new TThree();
TThree T2=new TThree();
T1.start();
T2.start();
}
}
