package tests;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num= 371;
		boolean isTrue = isArmstrong(num);
		System.out.println(isTrue);
		int
		sum = SumOfDigitsOfInteger(num);
		System.out.println(sum);
	}

	private static int SumOfDigitsOfInteger(int num) {
		int actualNumber =num;
		double result=0;
		while(actualNumber!=0) {
			int n = actualNumber%10;
			result= result+n;
			actualNumber=actualNumber/10;
		}
		
		return (int)result;
	}

	private static boolean isArmstrong(int num) {
		int actualNumber = num;
		double result=0;
		while(actualNumber!=0) {
			int n= actualNumber%10;
			result =result+Math.pow(n, 3);
			actualNumber = actualNumber/10;
		}
		if(result ==num) {
			return true;
		}else {
			return false;
		}
	}
}
