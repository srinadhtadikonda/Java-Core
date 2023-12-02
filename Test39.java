
public class Test39
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
int i,s=0;
for(i=0;i<a.length;i++)
{
	System.out.println("\t"+a[i]);
	s=s+a[i];
}
av=s/5;
		System.out.println("Sum="+s);
		System.out.println("Average="+av);
		
	}

}


