package com.program.tillarray;

public class Factorial {

	public static void main(String[] args) 
	{
	int num=90 ,fact=1;	
	if(num>0) {
	for(int i=1;i<=num;i++) {
	
		fact=fact*i;
	}
System.out.println(fact);
	}
	else if (num==0) {
		
	System.out.println("1");
	}
	}
}
