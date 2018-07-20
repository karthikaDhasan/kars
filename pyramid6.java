
public class pyra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5,m,c=0,k,l=1;
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=i;j<=n;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	     c++;
				
					
					for( m=l;m<=c;m++)
		    		 {
		    			 System.out.print(m);
		    		 }
		    		 for( m=l+1m<c-1;m--)
		    		 {
		    		 System.out.print(m);
		    		 }
			
				c=c+1;
				l++;
	    		 
	    	 System.out.print("\n");
	    	 
	     }
	}

}
