class MyThread extends Thread
{
	int x;
	MyThread(int x)
	{
		this.x=x;
	}
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
public class Test83 
{
public static void main(String args[])
{
	MyThread MT=new MyThread(1);
	MT.start();
}
}
