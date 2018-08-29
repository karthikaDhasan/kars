#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,i,j,temp,a[30],h;
    scanf("%d",&n);
    scanf("%d",&h);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
         
       }
       
    }
    for(i=0;i<h;i++)
    {
        printf("%d\t",a[i]);
    }
    for(j=n-1;j>=h;j--)
    {
     printf("%d\t",a[j]);   
    }
    
    return 0;
}
