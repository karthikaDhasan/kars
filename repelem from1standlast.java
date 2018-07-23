/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] a={10,20,10,40,40,20};
		int t=0,s=0;
		/*Scanner s=new Scanner(System.in);
	int a[]=new int[s.nextInt()];
	int c=0;
	for(int i=0;i<a.length;i++)
	{
	   a[i]=s.nextInt();
	   System.out.println(a[i]);
	}*/
		int[] b=new int[5];
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				c++;	
				}
			}
			if(c>0)
			{
				t++;//count value
				b[s]=a[i];//storing repeated ele
				s++;
				
			}
			
		}
		for(int k=0;k<t;k++)
		{
			System.out.println(b[k]);
		}
		
   
System.out.println("from last index:" +b[t-1]);
    
    System.out.println("from first index:" +b[0]);
    
	}
}


OUTPUT:
10
20
40
from last index:40
from first index:10
