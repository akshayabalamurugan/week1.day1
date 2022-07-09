package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=61;
		int rem=0;
		
		for (int i = 2; i <= (n-1); i++) {
			 rem= n%i;	
		}
		
		int value =rem;
		
		if (value==0) {
			
			System.out.println("The input is non prime number");
			
		}
		else {
			
			System.out.println("The input is prime number");
			
		}
	

	}

}
