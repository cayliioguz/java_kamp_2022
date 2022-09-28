package java_camp_2022;

public class asalSayi {

	public static void main(String[] args) {
		
		int number = 55;
		int remainder = number % 2;
		boolean isPrime= true;
		
		for ( int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime= false;
			}
		}
		if (isPrime==true) {
			System.out.println("Sayı asaldır.");
		}
		else 
			System.out.println("Sayı asal değildir.");
	}

}
