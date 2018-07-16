public class pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5,m;
     for(int i=1;i<=n;i++)
     {
    	 for(int j=i;j<=n;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	   
    		 for( m=1;m<=i;m++)
    		 {
    			 System.out.print(m);
    		 }
    		 for( m=i-1;m>0;m--)
    		 {
    		 System.out.print(m);
    		 }
    	 System.out.print("\n");
    	 
     }
	}

}

output:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
