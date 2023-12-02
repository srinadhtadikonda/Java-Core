#jagged Array

class Test
{
	public static void main(String[] args) 
	{
int a[][] = new int[3][];
    a[0]=new int[]{1,2,3,11};
    a[1]=new int[]{10,20,30,45,67,78};
    a[2]=new int[]{5,7,9};
    
    
    for (int i=0; i<a.length; i++)
       {
          for (int j=0; j<a[i].length; j++)
              System.out.print(a[i][j] + " ");
          System.out.println();
        }
}
	}
