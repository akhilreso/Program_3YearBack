package com.program.tillarray;
 //0,1,1,2,3,5,8,12,20...
public class Fibonacci 
{
public static void fib() {
	int i,n1=0,n2=1,count=13;
	System.out.println(n1 +""+n2);
	for(i=2;i<count;i++) 
	{
	int n3=n1+n2;	
	System.out.println(" "+n3);
	n1=n2;
	n2=n3;
	}
	
  }
}

