package com.program.tillarray;

public class ReverseNumber 
{
public static void main(String[] args) {
	
	int rev=0, rem, num=121;
	int temp=num;
	while (num!=0) 
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
	System.out.println("The reverse number is = " +rev );
	
	}
}
