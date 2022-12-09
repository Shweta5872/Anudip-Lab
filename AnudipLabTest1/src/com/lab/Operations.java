package com.lab;

public class Operations {

	public static void main(String[] args) {
		int num1 =40;
		int num2 = 30;
        int operator = 3;
        switch(operator)
		{
		case 1:
			System.out.println("Sum =" +num1+num2);
			break;
		case 2:
			System.out.println(num1-num2 +"Difference");
			break;
		case 3:
			System.out.println("Multiplication =" +num1*num2);
			break;
		case 4:
			System.out.println("Division =" +num1/num2);
            break;
		case 5:
			System.out.println("Mode =" +num1%num2);
			break;
		default:
			System.out.println("Enter your correct choice");
			break;
		
		
				
		
		}
	}

}
