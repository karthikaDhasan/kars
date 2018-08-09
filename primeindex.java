import java.util.ArrayList;


public class primeindex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={25,27,28,34,26,78,94,89},i,j,c;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(i=0;i<a.length;i++)
		{
			c=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					{
					c=1;
					}
				}
			if(i>1)
			{
			if(c==0)
			{
				al.add(a[i]);
			}
			}
	}
		System.out.println(al);
		
	}

}
output:
[28, 34, 78, 89]
