import java.util.Scanner;


public class pgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fn=sc.nextLine();
		String ln=sc.nextLine();
		String sn="",bn="";
		char a1,a2 ;
        int pn=sc.nextInt();
        int n=sc.nextInt(),i;
       /* System.out.println("First name="+" "+fn);
        System.out.println("Last name="+" "+ln);
        System.out.println("PIN="+" "+pn);
        System.out.println("N="+" "+ n);*/
        if(fn.length()!=ln.length())
        {
        if(fn.length()<ln.length())
        {
        	sn=fn;
        	bn=ln;
        }
        else if(fn.length()>ln.length())
        {
        	bn=fn;
        	sn=ln;
        }
        }//if
        else
        {
        	/*for(i=0;i<fn.length();i++)
        	{
        	int a=fn.charAt(i);
    		int b=ln.charAt(i);
    		if(a!=b)
    		{
    			if(a>b)
    			{
    				//System.out.println(a);
    				//System.out.println(b);
    				bn=fn;
    				sn=ln;
				break;
    			}
    			else
    			{
    				sn=fn;
    				bn=ln;
    			}
    		}//if
    		
        	}*/
		//or
		if(fn.compareTo(ln)>0)
		{
			sn=ln;
			bn=fn;
		}
		else
		{
			sn=fn;
			bn=ln;
		}
        	
        }//else
        System.out.println("smaller name:"+sn);
        System.out.println("larger name:"+bn.charAt(0));
        
        String s=String.valueOf(pn);
        a1=s.charAt(n-1);
        a2=s.charAt(s.length()-n);
       System.out.println("Index L-R:"+a1);
       System.out.println("Index R-L:"+a2);
       String main=bn.charAt(0)+sn+a1+a2;
       System.out.println("user-id:"+" " +main);
       System.out.println("user-id()after toggle:");
       for(i=0;i<main.length();i++)
       {
    	  char c=main.charAt(i) ;
    	  if(Character.isUpperCase(c))
    	  {
    		  System.out.print(Character.toLowerCase(c));
    	  }
    	  else
    	  {
    		  System.out.print(Character.toUpperCase(c));
    	  }
    		  
       }
        

	}

}

EXAMPLE1:
INPUT:
RAJIV
Roy
624003
2
OUTPUT:
smaller name:Roy
larger name:R
Index L-R:2
Index R-L:0
user-id: RRoy20
user-id()after toggle:
rrOY20

EXAMPLE 2:
kara
karb
344564
2
smaller name:kara
larger name:k
Index L-R:4
Index R-L:6
user-id: kkara46
user-id()after toggle:
KKARA46
