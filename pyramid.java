/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5,i,k,j,c=0;
		for(i=1;i<=n;i++)
		{           
		
			for(j=i;j<=n;j++)
			{
				System.out.print("\t");
				
			}
			c++;
			for(k=1;k<=c;k++)
			{
				System.out.print("\t"+i);
			}
			c=c+1;
			System.out.println("\n");
		            	
		}
	}
}
output:
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5 
