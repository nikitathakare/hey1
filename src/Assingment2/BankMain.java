package Assingment2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
   BankAccount bk =new BankAccount(123, "OK","Savings",1000);
  // bk.deposite(-12);
   bk.withdraw(1000);
  // System.out.println(bk.balance);
   
    
   
	}

}
