public class Test45
{
	public static void main(String args[])
	{
		int a[][]= new int[3][3];
		a[0][0]=10;
		a[0][1]=10;
		a[0][2]=10;
		
		a[1][0]=10;
		a[1][1]=10;
		a[1][2]=10;
		
		a[2][0]=10;
		a[2][1]=10;
		a[2][2]=10;
		
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			System.out.print("\t"+a[i][j]);
			System.out.println();
			}
		}
	}


	