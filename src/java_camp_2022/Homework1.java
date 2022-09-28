package java_camp_2022;

public class Homework1 {

	public static void main(String[] args) {
		
		//arrays
		String[] coworkers = new String[4];
		coworkers[0]= "Engin";
		coworkers[1]= "Oguz";
		coworkers[2]= "Kubi";
		coworkers[3]= "Ugur";
		
		for(int i=0; i<coworkers.length; i++ ) {
			System.out.println(coworkers[i]);
		}
		
		System.out.println("--------------");
		
		for(String workers: coworkers) {
			System.out.println(workers);
		}
		
		double[] numberList = {1.2,9.5,1.5,2.5,3.7};
		double total= 0;
		double biggest = numberList[0];
		
		for(double number : numberList) {
			if(biggest<number) {
				biggest= number;
			}
			total=total+number;
			System.out.println(number);
			
		}
		System.out.println("The total of these numbers= " + total);
		System.out.println("The biggest number = " + biggest);
		
		System.out.println("-----------");
		
		//multi-dimentional arrays
		
		String cities [][] = new String [2][2];
		
		cities [0][0]= "NYC";
		cities [0][1]= "Doha";
		cities [1][0]= "Istanbul";
		cities [1][1]= "Bursa";
		
		for(int i =0; i<=1; i++) {
			for(int j=0; j<=1; j++) {
				System.out.println(cities[i][j]);
			}
		}
		System.out.println("---------------");
		
		//strings
		
		String message = "What a good day.";
		System.out.println("The amount of letters in this sentence: " + message.length());
		System.out.println(message.concat(" With the nice weather."));
		System.out.println(message.startsWith("W"));
		System.out.println(message.endsWith("a"));
	}

}
