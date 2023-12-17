package maplab;

import java.util.Scanner;

public class tornrysoru {public static void main(String[] args) {
	// kullanıcıdan b ır sayı isteyın, sayıyı kontrol edın 5 ıle bolunebılıyorsa "sayı 5 ın tam katı 
   // yazdırın
	
	/*Scanner scanner=new Scanner(System.in);
	System.out.println("bır sayı gır");
	int sayı=scanner.nextInt();
	System.out.println(sayı%5==0 ?"sayı 5 ın katı" : " 5 in katı degıl");
	*/
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("ucgenın bır kenarını gır");
	int kenar1=scanner.nextInt();
	System.out.println("ucgenın bır kenarını gır");
	int kenar2=scanner.nextInt();
	System.out.println("ucgenın bır kenarını gır");
	int kenar3=scanner.nextInt();
	
	System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar ucgen degılll");
}

}
