import java.util.*;
public class Test46
{
	public static void main(String args[])
	{
Scanner SC=new Scanner(System.in);
int a[][]=new int[100][100];
int r,c,i,j;

System.out.print("Enter number of rows..:");
r=SC.nextInt();

System.out.print("Enter number of columns..:");
c=SC.nextInt();

for(i=0;i<r;i++)
{
	for(j=0;j<c;j++)
		a[i][j]=SC.nextInt();
}
for(i=0;i<r;i++)
{
	for(j=0;j<c;j++)
		System.out.print(a[i][j]+"\t");
	System.out.println();
}

}
}
