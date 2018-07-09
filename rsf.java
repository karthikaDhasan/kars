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
		int n=5271,i,c,d;
		if(n>=100)
		{
			String str=" ";
			String s=Integer.toString(n);
			for(i=0;i<s.length()-1;i++)
			{ 
				
				int a=Integer.parseInt(Character.toString(s.charAt(i)));
				int b=Integer.parseInt(Character.toString(s.charAt(i+1)));
			     c=a-b;
			    d=Math.abs(c);
			    str=str+Integer.toString(d);
		                
			}
			System.out.println(str);
			String  s3=str;
			int e=Integer.parseInt(s3);
			String str1="0";
			if(e>99)
			{
			 String s1=Integer.toString(e);
			for(i=0;i<s1.length()-1;i++)
			{ 
				
				int a=Integer.parseInt(Character.toString(s1.charAt(i)));
				int b=Integer.parseInt(Character.toString(s1.charAt(i+1)));
			     c=a-b;
			     d=Math.abs(c);
			    str1=str1+Integer.toString(d);
		                
			}	
			}
			System.out.println(str1);
			
		}
	}
}
