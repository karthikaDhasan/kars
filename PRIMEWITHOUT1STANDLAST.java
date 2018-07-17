import java.lang.reflect.Array;
import java.util.Arrays;


public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={10,41,80,50,43,31,29,25,59,96,67};
		int c=0,z=0,w=0,k=0;
		int b[]=new int[40];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			 int count=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
				
					count=1;
				}
				
			}
			
			/*if(count==0)
			{
				c++;
				if(c!=1)
				{
					z=z+a[i];
				}
				
			
			}*/
			if(count==0)
			{
				c++;
				b[k]=a[i];
				k++;
			}
			
			}
		for(int y=1;y<=c;y++)
		{
			z=z+b[y];
		}
		System.out.println("sum of prime without 1st prime no:" +z);
	for(int y=0;y<c-1;y++)
	{
		w=w+b[y];
	}
		System.out.println("sum of prime without last prime no:" +w);
		
		

	}


OUTPUT:
sum of prime without 1st prime no:241
sum of prime without last prime no:203

