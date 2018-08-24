
public class arrayadd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,10,3,5};
		int i,j,sum=0,c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==15)
				{
					c=c+1;
				}
			}
			
			
		}
		//System.out.println(sum);
		System.out.println(c);
		
		
	}

}

output:
count=2
