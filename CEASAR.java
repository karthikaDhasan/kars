import java.util.Scanner;


public class cee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      String s="meet me after the toga party";
	      String s1=s.toUpperCase();
	      String[] s2=s1.split(" ");
	      int k=4,i,j;
	      System.out.println("encryption:");
	      for(i=0;i<s2.length;i++)
	      {   
	    	  
	          char[] ch=s2[i].toCharArray();
	          for(j=0;j<ch.length;j++)
	          {
	    	  char a=s2[i].charAt(j);
	    	  
	    	  int as=a;
	    	  int as1=k+as;
	    	  if(as1>90)
	    	  {
	    		   as1=as1-90;
	    		   int as2=64+as1;
	    		   char c=(char)as2;
	    	    System.out.print(c);
	    	    as1=0;
	    	  }
	    	  char c=(char)as1;
	    	  System.out.print(c);
	      
	      }
	          System.out.print("\t");
	      }
	      String st="QIIX QI EJXIV XLI XSKE TEVXC";
	      String[] st1=st.split(" ");
	      int k1=4,l,m;
	      System.out.println(" ");
	      System.out.println("decryption:");
	      
	      for(l=0;l<st1.length;l++)
	      {   
	    	  
	          char[] ch=st1[l].toCharArray();
	          for(m=0;m<ch.length;m++)
	          {
	    	  char a=st1[l].charAt(m);
	    	  
	    	  int as=a;
	    	  int as1=as-k1;
	    	  if(as1<65)
	    	  {
	    		   //as1=as1-90;
	    		   int as2=26+as1;
	    		   char c=(char)as2;
	    	    System.out.print(c);
	    	    as1=0;
	    	  }
	    	  char c=(char)as1;
	    	  System.out.print(c);
	      
	      }
	          System.out.print("\t");
	      }
	}

}
output:
encryption:
QIIX	QI	EJXIV	XLI	XSKE	TEVXC
decryption:
MEET	ME	AFTER	THE	TOGA	PARTY
