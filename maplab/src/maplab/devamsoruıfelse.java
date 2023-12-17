package maplab;

import java.util.Scanner;

public class devamsoruıfelse {public static void main(String[] args) {
	

	Scanner scanner=new Scanner(System.in);
	double kılo=1;
	double boy=1;
	
	
	System.out.println("boyunuzu gırınız ");
	boy=scanner.nextDouble();
	System.out.println("kılonuzu gırınız");
	kılo=scanner.nextDouble();
	
	double vke=(kılo*1000/(boy*boy));
	
	
	if (kılo<20 || kılo>200 || boy<30 || boy>200 || vke<10 || vke>50) {
		System.out.println("degerlerı kontrol et");
	}
	else if (vke>30) {
		System.out.println("obezsınız az ye");
		
	}
	else if (vke >25) {
		System.out.println("kılolu ");
	}
	
	else if (vke>20) {
		System.out.println("normal");
	} else {
		System.out.println("zayıf");

	}
	
	
	  
}

}
