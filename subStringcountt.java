import java.util.ArrayList;
public class str {
	public static void main(String[] args) {
		String s="account";
		int i,j,c,t=0,t1=0;
		ArrayList<String> al=new ArrayList<String>();
		for(i=0;i<s.length();i++)
		{
			String d="";
			c=0;
			 for(j=i;j<s.length();j++)
				{
					d=d+s.charAt(j);
					c++;
					if(c>1)
					{
						if(!s.equals( d))
						{
						al.add(d);
						t++;
						}
					}
					
				}
			 
		}
		System.out.print(t);
		System.out.print(al);
    for(i=1;i<=t;i++)
    {
    	String g=al.get(i);
    	if(g.contains("c"))
    	{
    		t1++;
    		System.out.print(t1);
    	}
    	
    }
	}

}

output:
String  S="account";
1.find out the possible no of substring of S.
2.Minimum two characters in all substring.
3.Findout the no of substring  having character C.

ANSWER:
substring:[ac, acc, acco, accou, accoun, cc, cco, ccou, ccoun, ccount, co, cou, coun, count, ou, oun, ount, un, unt, nt]
no.of.substring:20
substring contains 'c':14
