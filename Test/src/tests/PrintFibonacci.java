package tests;

public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =7;
		//printFibonacci(count);
		printFibonacci1(count);
	}

	private static void printFibonacci1(int count) {
		int[] num = new int[count];
		num[0]=0;
		num[1]=1;
		for (int i = 2; i < num.length; i++) {
			num[i]=num[i-1]+num[i-2];
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		
		
	}

	private static void printFibonacci(int count) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=1;
		
		for (int i = 1; i <=count; i++) {
			System.out.print(a +" ");
			a=b;
			b=c;
			c=a+b;
		}
		
	}

}
