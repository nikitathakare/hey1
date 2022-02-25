package Assingment2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
	
	boolean PalindromeCheck(String str) {
		int i =0 ;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				
				return false;
			}
				i++;
				j--;
		}
			
			return true;
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String word = sc.next();
		StringPalindrome str1 =new StringPalindrome();
		
		if(str1.PalindromeCheck(word)) {
			System.out.println("Word is Palindrome");
		}
		else {
			System.out.println("Word is non-Palindrome");
		}
		
		
		
		
		
				

	}

}
