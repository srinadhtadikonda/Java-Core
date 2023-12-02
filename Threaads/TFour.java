import java.lang.*;
class TFour extends Thread
{
public void run()
{
System.out.println("Thread is running"+Thread.currentThread().getPriority());
}
}
class Main 
{
    public static void main(String args[])
{
TFour T1=new TFour();
TFour T2=new TFour();
T1.setPriority(Thread.MIN_PRIORITY);
T2.setPriority(Thread.MAX_PRIORITY);
T1.start();
T2.start();
}
}
