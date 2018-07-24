import java.util.ArrayList;


public class JOHN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"JoHn","jOhnY","jaNarDhan"};
		String[] s1=new String[10];
		int i;
		ArrayList<String> s2=new ArrayList<String>(10);
		ArrayList fr=new ArrayList();
		ArrayList md=new ArrayList();
		ArrayList end=new ArrayList();
		for(i=0;i<s.length;i++)
		{
			int l=s[i].length();
			if(l%3==0)
			{
			  fr.add(s[i].substring(0,l/3));
			  md.add(s[i].substring(l/3,(l/3)*2));
			  end.add(s[i].substring((l/3)*2,l));
			}
			else if(l%3==1)
			{
				fr.add(s[i].substring(0,1));
				md.add(s[i].substring(1,l-1));
				end.add(s[i].substring(l-1));
			}
			else
			{
				fr.add(s[i].substring(0,2));
				md.add(s[i].substring(2,l-2));
				end.add(s[i].substring((l-2),l));
		
			}
		}
			System.out.print(fr);
			System.out.print(md);
			System.out.print(end);
			System.out.println();
			s2.add(fr.get(0)+ "" +md.get(1)+ "" +end.get(2));
			s2.add(md.get(0)+ "" +end.get(1)+ "" +fr.get(2));
			s2.add(end.get(0)+ "" +fr.get(1)+ "" +md.get(2));
			Object[] ob=s2.toArray();
			for(i=0;i<ob.length;i++)
			{
			System.out.println(ob[i]);
			String z=ob[i].toString();
			char[] c=z.toCharArray();
			for(int j=0;j<z.length();j++)
			{
				if(Character.isUpperCase(c[j]))
				{
					System.out.print(Character.toLowerCase(c[j]));
				}
				else
				{
					System.out.print(Character.toUpperCase(c[j]));
				}
		
			}
			System.out.println();
			}
		}
	

}


QUESTION:

             kars was assigned the task of comingup an encoding mechanism for any given 3 strings.she was comingup with following plan
given any 3 strings break each string into three parts.
STEP 1: 
      If no of char in the string are  in the multiple of 3.each split will contain equal of characters are seen in 

janardhan
      If no of char in the string are not in the multiple of 3 and if there is one char more than the multiple of 3 then 

middle part will get the xtra char as in input 1.
      If no of char in the string are not in the multiple of 3 and if there are 2 char more than multiple of 3 then front 

and end part will get one char xtra each as in input 2.
STEP 2:
    concatenate front,middle,end part of string as per the below specified concatenation rule to form three output strings
       OUTPUT1:  front part of ip1 and middle part of ip2 and end part of ip3.
       OUTPUT2:  middle part of ip1 and end part of ip2 and front part of ip3.
       OUTPUT3:  end part of ip1 and front part of ip2 and middle part of ip3.
STEP3:
    apply the toggle rule(lowercase to uppercase and vice-versa) in each output.

    INPUT1:John
    INPUT2:Johny
    INPUT3:Janardhan

STEP1 OUTPUT:
    "J" "oh" "n" 
    "Jo" "h" "ny"
    "Jan" "ard" "han"
STEP2 OUTPUT:
    Jhhan
    ohnyJan
    nJoard
STEP3 OUTPUT:
     jHHAN
     OHNYjAN
     NjOARD
    
