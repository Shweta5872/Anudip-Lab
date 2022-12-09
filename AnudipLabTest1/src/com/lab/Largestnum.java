package com.lab;

public class Largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 5;
       int b = 8;
       int c = 10;
       largest(a,b,c);
	}
	public static void largest(int a, int b, int c)
	{ 
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if (b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		}
	}
