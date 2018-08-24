maadu no
Input 1: kars
Input 2:(100-999)-105
convert that number to mod 26 (1- 26)
check the occurance of character in the string
  If char present one time-stable
  If char present more than one time-unstable
  If char not present-return 0
  
  
  
public class maaduno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               String s="applebb";
               int a=100,c=0;
               char x[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
               int i,j,b;
               System.out.println("The string is :" +" " +s);
               System.out.println("The number is: "+ " " +a);
               if(a>=100 && a<=999)
               {
               b=a%26;
               System.out.println("mod number:"+" "+b);                  
               System.out.println("mod char:" + " "+x[b]);
               for(i=0;i<s.length();i++)
               {
            	   if(x[b]==s.charAt(i))
            	   {
            		   c++;
            	   }
            	   
               }
               if(c==1)
               {
            	   System.out.print("string is stable");
               }
               else if(c!=1 && c!=0)
               {
            	   System.out.print("string is unstable");
               }
               else
               {
            	   System.out.print("zero");
               }
               }
               else
               {
            	   System.out.println("Enter a valid number");

               }
               
	}

}
 
 output:
 The string is : applebb
The number is:  100
mod number: 22
mod char: w
zero
