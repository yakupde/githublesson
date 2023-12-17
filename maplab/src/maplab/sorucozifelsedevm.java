package maplab;

import java.util.Scanner;

public class sorucozifelsedevm {public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("notunuzu gırınız ");
	int gırılennot=scanner.nextInt();
	
	if (gırılennot<0 || gırılennot>100) {
		System.out.println("gecersiz not");
		
	}
	else if (gırılennot<50) {
		System.out.println("kaldın");
		
	}else  {
		System.out.println("gectın");
		
	} 
	
	
	
	
}

}
