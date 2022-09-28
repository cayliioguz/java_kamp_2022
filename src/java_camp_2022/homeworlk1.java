package java_camp_2022;

public class homeworlk1 {

	public static void main(String[] args) {

		System.out.println("Selam kamp!");
		int ogrenciSayisi = 11 ;
		
		System.out.println("öğrenci sayım" + ogrenciSayisi + " kişidir.");
		
		// if else şart blokları
		
		int not = 49; 
		
		if(not>=50) {
			System.out.println("Dersi geçtiniz!");
		}
		else {
			System.out.println("Dersten kaldınız.");
		}
		
		//En büyük sayı bulma
		
		int sayi1, sayi2, sayi3, enBuyuk;
		sayi1 = 35;
		sayi2 = 55;
		sayi3 = 45;
		enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2 ; 
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı " + enBuyuk);
		
		//switch caseleri
		
		char grade = 'F';
		
		switch (grade) {
		
		case 'A' :
			System.out.println("dersi geçtiniz!");
			break;
		case 'D' :
			System.out.println("şartlı geçtiniz.");
			break;
		case 'F' :
			System.out.println("Dersten kaldınız.");
			break;
			default:
				System.out.println("geçersiz not girdiniz");
		}
		
		//for döngüsü
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti.");
		
		//while döngüsü
		
		int i=1;
		while(i <5) {
			System.out.println(i);
			i++;

		}
			
			System.out.println("while döngüsü bitti.");

		 
	}
	}
