package Assingment2;

import java.util.Arrays;

public class ComputeArray {
	int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};

	void operation() {
		int sum =0;
		int temp=0;
		int min =0;
		
		for(int i=0;i<15;i++) {
			 sum =sum+A[i];
			}
	   for(int i=0;i<15;i++) {
			 if(A[i]<A[i+1]) {
				 temp = A[i+1];
				 A[i+1]=A[i];
				 A[i]=temp;
				 min =A[i+1];
				
			 }
		}
		A[15]=sum;
	    A[16]=sum/18;
	    A[17]=min;
		System.out.println("Sum "+A[15]);
		System.out.println("avg "+A[16]);
		System.out.println("min "+A[17]);
		System.out.println(Arrays.toString(A));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeArray arr =new ComputeArray();
		arr.operation();
	}

}
