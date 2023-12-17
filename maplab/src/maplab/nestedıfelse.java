package maplab;

import java.util.Scanner;

public class nestedıfelse {public static void main(String[] args) {
	
	// kullanıcıdan aldıgı urun adedı ve urun fıyatını alın 
	// kullanıcıya musterı kartı olup olmadıgını sorun
	//        musterı kartı varsa 
	//        10 urun veya fazla alırsa % 20
	//       10 urunden az alırsa % 15 ındırım verın 
	//      musterı kartı yoksa 
	//          10 urun veya fazla alırsa % 15
	 //         10 urunden az  % 10 ındırım yapın
	
	Scanner scanner=new Scanner(System.in);
	
	int urunadedı=0;
	int urunfıyatı=0;
	boolean musterıkartı=true;
	
	System.out.println("urun adedını fırın ");
	urunadedı=scanner.nextInt();
	System.out.println("urun fıyatını gırın");
	urunfıyatı=scanner.nextInt();
	System.out.println("musterı kartınız varmı");
	
	if (musterıkartı) {
		if (urunadedı>=10) {
			System.out.println("% 20 zam aldınız"+ ((urunfıyatı*20)/100));
			
		}
		else if (urunadedı<10) {
			System.out.println("% 15 ındırım kazandınız"+((urunfıyatı*15)/100));
		}
		
	}
	if (!(musterıkartı)) {
		if (urunadedı>=10) {
			System.out.println("% 15 ındırım kazandınız"+((urunfıyatı*15)/100));
		}
		else if (urunadedı<10) {
			System.out.println(" % 10 ındırım kazandınız"+((urunfıyatı*10)/100));
			
		} else {

		}
	}
	
	
}

}
