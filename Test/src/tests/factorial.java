package tests;

public class factorial {
	
	public static void main(String[] args) {
		
		int n = 3;
		
		int value = factorial(n);
		System.out.println(value);
	
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return n;
		else
			return (n * factorial(n-1));
	}

}
