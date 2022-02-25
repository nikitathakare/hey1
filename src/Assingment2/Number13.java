package Assingment2;

import java.util.Scanner;

public class Number13 {
	
	void Number(int num1,int num2) {
		
		for (int i= 1 ;i<=13;i++) {
			 
				  System.out.print(num1+" "); /* On each iteration, we are assigning second number * to the first number and assigning the sum of last two * numbers to the second number */ 
				  int sumOfPrevTwo = num1 + num2; 
				  num1 = num2; 
				  num2 = sumOfPrevTwo;
			
			//System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 =sc.nextInt();
		Number13 obj =new Number13();
		obj.Number(Num1,Num2);
	}

}
