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
    
