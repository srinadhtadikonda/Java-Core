package corejavaprograms;

import java.lang.*;
class TestThreadOne extends Thread
{
public void run()
{
try
{
int i;
for(i=1;i<=10;i++)
{
Thread.sleep(1500);
System.out.println(i);
}
}catch(InterruptedException ex)
{
System.out.println(ex);
}
}
}
class Main
{
public static void main(String args[])
{
TestThreadOne TTO=new TestThreadOne();
TTO.start();
}
}
