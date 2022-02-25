package Assingment2;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Bingo {
int arr[] = {5,12,34,23,45};

void value(int num1,int num2) {
	boolean bool1=false;
	boolean bool2=false;
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]==num1 || arr[i]==num2) {
			bool1 = true;
		}
		
	}
	for (int j =1;j<arr.length;j++) {
		if(arr[j]==num1 || arr[j]==num2) {
			bool2 = true;
		}
	}
	if(bool1 == true && bool2 == true) {
		System.out.println("BINGO!!");
	}
	else {
		System.out.println("Not Found!");
	}
	
	
		System.out.print("ARRAY was "+ Arrays.toString(arr));
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 =sc.nextInt();
		Bingo b1=new Bingo();
		b1.value(Num1, Num2);
	}

}
