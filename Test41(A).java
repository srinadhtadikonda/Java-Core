
public class Test40
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
int i,max=a[0],min=a[0];
	
for(i=0;i<5;i++)
{
	System.out.println("\t"+a[i]);
	if(a[i]>max)
	max=a[i];
	else if(a[i]<min)
	min=a[i];
	

}

		System.out.println("Max="+max);
		System.out.println("Min="+min);
		
	}

}

