package com.program.tillarray;

public class Fibonicci {

	public static void main(String[] args) {
		System.out.println(fibonacci(20));
		
	}
public static int fibonacci(int number)
{ 
	if(number == 1 || number == 2)
	{ 
		return 1; 
		} 
	return fibonacci(number-1) + fibonacci(number -2); //tail recursion }

}  
}


