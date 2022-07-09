package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		
		int a=0;
		
		int b=1;
		
		System.out.println(a);
		
		for (int i = 1; i < n; i++) {	
			int sum=a+b;
			System.out.println(sum);
		b=a;
		a=sum;
			
		}			
	
		
	}

}
