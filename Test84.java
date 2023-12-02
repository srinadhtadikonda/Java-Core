class MyThreads implements Runnable
{
	public void run()
	{
		try
		{
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(1500);
			System.out.println(i);
		}
		}catch(Exception ex)
		{
			System.out.println("Thread Halted");
		}
		
	}
}
public class Test84 
{
public static void main(String args[])
{
	MyThreads M=new MyThreads();
	Thread MT=new Thread(M);
	MT.start();
}
}
