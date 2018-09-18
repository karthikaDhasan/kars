import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		int a[]=new int[n];

		int j=0;
		int b[]=new int[n];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
			System.out.println(al);
		}
		for(int i=0;i<a.length;i++)
		{
			b[j]=Collections.frequency(al,a[i]);
			j++;
		}
			for( j=0;j<b.length;j++)
		{
				System.out.print(b[j]);
				if(j!=n-1)
				{
					System.out.print(" ");	
				}
		}
		
		
	}
}
output
11
45
45
67
67
67
[11]
[11, 45]
[11, 45, 45]
[11, 45, 45, 67]
[11, 45, 45, 67, 67]
[11, 45, 45, 67, 67, 67]
1 2 2 3 3 3
