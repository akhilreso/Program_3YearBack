package com.program.tillarray;

public class Palindrom {

	public static void main(String[] args) 
	{
		int num=126, rev=0;
		int temp=num;
				while(num !=0) {
					int rem = num%10;
					rev=rev*10+rem;
					num=num/10;
				}
			if(temp==rev) {
				System.out.println("Number is pelindrom");
			}	
			else {
				System.out.println("Number is not pelindrom");
			}

	}

}
