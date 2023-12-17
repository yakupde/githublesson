package maplab;

import java.util.Scanner;

public class sorucozifelse {public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("bır sayı gırın");
	int gırılensayı=scanner.nextInt();
	
	 if (gırılensayı%3==0 && gırılensayı%5==0) {
		System.out.println("super sayı");
		
	}
	
	else if (gırılensayı%3==0) {
		System.out.println("3 e bolunuyor");
		
	}
	else if (gırılensayı%5==0) {
		System.out.println("5 e bolunuyor");
	}
	
	else   {
	System.out.println(" cope at gıtsın");
	} 

	
	
}

}
