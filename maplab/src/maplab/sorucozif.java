package maplab;

import java.util.Scanner;

public class sorucozif {public static void main(String[] args) {
	// kullanıcıdan bır ucgen ıste 3 kenar uzunl al
	// ucgen eskenar ıse eskenar yazdır
	
	
	Scanner scanner=new Scanner(System.in);
	 System.out.println(" ucgenın  bır kenarlarını gırınız");
	 int ucgenkenar1=scanner.nextInt();
	 System.out.println(" ucgenın dıger kenarını gırınız");
	 int ucgenkenar2=scanner.nextInt();
	 System.out.println(" ucgenın dıgerbkenarını gırınız");
	 int ucgenkenar3=scanner.nextInt();
	 
	 if (ucgenkenar1==ucgenkenar2 &&ucgenkenar1==ucgenkenar3) {
		 System.out.println("eskenar ucgen");
		
	}
	 else {
		System.out.println("eskenar ucgen degıl");
	}
}

}
