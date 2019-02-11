package com.AJ1913;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,m=1;
		int b[][]=new int[100][100];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(y=0;y<n;y++)
		{
			for(x=y;x<n;x++)
			{
				b[x][y]=m++;
				//System.out.println(b[x][y]);
			}
		}
		for(x=0;x<n;x++)
		{
			for(y=0;y<n;y++)
			{
				if(b[x][y]!=0)System.out.print(b[x][y]+" ");
			}
			System.out.println();
		}
	}

}

INPUT
6
OUTPUT
1 
2 7 
3 8 12 
4 9 13 16 
5 10 14 17 19 
6 11 15 18 20 21
