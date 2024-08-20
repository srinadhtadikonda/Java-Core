import java.lang.*;
class TThree implements Runnable
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
Thread TT1=new Thread(T1);
TThree T2=new TThree();
Thread TT2=new Thread(T2);
TT1.start();
TT2.start();
}
}

