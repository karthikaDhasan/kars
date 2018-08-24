
public class digitsuminstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String n="aa11b33";
       int i,a,s=0;
       for( i=0;i<n.length();i++)
       {
    	   if(Character.isDigit(n.charAt(i)))
    	   {   //System.out.println(n.charAt(i));
    		   s=s+Integer.parseInt(Character.toString(n.charAt(i)));
    		   //System.out.println(s);
    	   }
    	   
       }
       if(s!=0)
	   {
		   System.out.println(s);
	   }
	   else
	   {
		   System.out.println("zero");
	   }
       
	}

}
output:
1+1+3+3=8
output1:
acjii
ans:0
