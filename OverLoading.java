package com.program.tillarray;

public class OverLoading {
	int a;
	public void add(int c ,int b) 
	{
		 a=b+c;
		System.out.println("addition of two number is " +a);
	}
	public void add(int c, int b, int d) {
		int k=b+c+d;
		System.out.println("addition of three number is " +k );
		
	}

}
