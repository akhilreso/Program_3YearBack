package com.program.tillarray;

public class RealSingleTonClass
{
 static RealSingleTonClass r;
	 private RealSingleTonClass() 
	 {
	
		 
    }
	 public static RealSingleTonClass grtRealSingleTonClass() {
		 if(r==null) {
			 r=new RealSingleTonClass();
		 }
		 return r;
	 }
public void method() {
	
System.out.println("SingleTon class");
	
 }	  

}

