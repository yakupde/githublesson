package maplab;

import java.util.Scanner;

public class rahımeifsorucoz {public static void main(String[] args) {
	//kullanıcıdan notunu alın 50 veya daha buyukse sınıfı gectın
	//50 den kucukse malesef kaldın yazdırın
	
	Scanner scanner=new Scanner(System.in);
	System.out.println(" lutfen notunuzu gırınız");
	int not=scanner.nextInt();
	if (not>=50) {
		System.out.println("sınıfı gectın");
	}
	
	else {
		System.out.println("sınıfta kaldın");
	}
	
}

}
