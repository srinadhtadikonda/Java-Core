import java.lang.*;
class TThree extends Thread
{
public void run()
{
System.out.println("Thread is running"+Thread.currentThread());
}
class Main 
{
public static void main(String args[])
{
TFour T1=new TFour();
TFour T2=new TFour();
T1.start();
T2.start();
}
}
