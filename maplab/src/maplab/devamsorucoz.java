package maplab;

import java.util.Scanner;

public class devamsorucoz {public static void main(String[] args) {
	
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("cınsıyetınızı gırınız E: erkek  K: kadın ");
	char cınsıyet=scanner.next().toUpperCase().charAt(0);
	System.out.println("yasınızı gırınız");
	double yas=scanner.nextDouble();
	if (yas<20 || yas> 80 || !( cınsıyet== 'E'||cınsıyet=='K')) {
		System.out.println(" gırılen bılgıler yanlıs");
		
	}
	
		
	 else if (cınsıyet=='E' && yas>65) {
		System.out.println("emeklı olabılırsın");
	}
	else if (cınsıyet=='E' && yas<65) {
		System.out.println("emeklı olması ıcın  daha"+(65-yas)+ "yıl calısması lazım");
		
	}
	else if (cınsıyet=='K' && yas>=60) {
		System.out.println(" kadın emeklı olabılır");
		
	}
		
	else {
		System.out.println(" kadın emeklı olması ıcın daha "+( 60-yas)+ "yıl calısması gerekır");
	}
	
}

}
