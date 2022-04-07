package com.program.tillarray;

public class BubbolShort {

	public static void main(String[] args)
	{
		int[] a= {21,32,43,1,3};
		int[] b=a;
		int temp;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
					
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
          System.out.println(a[i]+" ");
	}
		
		}

}
