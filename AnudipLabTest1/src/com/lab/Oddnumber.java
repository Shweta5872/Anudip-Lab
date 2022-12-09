package com.lab;

public class Oddnumber {

	public static void main(String[] args) {
		int num =20;
		OddNum(num);
	
		System.out.println("These are Odd Numbers from 1 to 20");
	} 
	public static void OddNum(int n) {
		
	
       for(int i =1; i<=n; i++) {
    	   if(i % 2 != 0) {
    	
    		   System.out.println(i);
    	   }
       }
    	   
	
	}
}
