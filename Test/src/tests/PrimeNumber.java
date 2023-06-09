package tests;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 17;
		boolean isTrue = isPrime(n);
		boolean isTru = isPrime1(n);
		
		System.out.println(isTrue);
		
	}
	
	

	private static boolean isPrime1(int n) {
		
		if(n<=1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}



	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) {
			return false;
		}
		if(n==2) {
			return false;
		}
		
		if(n%2==0) {
			return false;
		
		}else
		{
			return true;
		}
		
	}

}
