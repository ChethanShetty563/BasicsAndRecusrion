package Basic1;

public class Non_Zero_Digit_Of_Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(lastDigit(6));
		
		
		

	}
	
	static int digi[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
	
	static int lastDigit(int n) {
		
		
		if(n<10) {
			return digi[n];
		}
		
		if(((n  % 10) % 10) % 2 == 0) {
			return (6 * lastDigit(n/5) * lastDigit(n%10)) % 10;
		}
		else {
			return (6 * lastDigit(n/5) * lastDigit(n%10)) % 10;
		}
	}

}
