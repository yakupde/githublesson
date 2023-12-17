package maplab;

import java.util.Scanner;

public class rahıme {public static void main(String[] args) {

	// kullanıcıdan bır strın ısteyın ve strıngı tersıne cevırıp kaydedın
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("lutfen bır strıng yazı gırınız");
	 String gırılenmetın=scanner.nextLine();
	 
	String tersmetın="";
	
	 for (int i = gırılenmetın.length()-1; i >=0; i--) {
		 
		tersmetın+=gırılenmetın.charAt(i);}
		System.out.println("gırılen metın ters halı:"+ tersmetın);
		
		
		if ( gırılenmetın.equalsIgnoreCase(tersmetın)) {
			System.out.println("gırılen metın polındrome");
			
		}
		else {
			System.out.println("gırılen metın polındrome degıl");
		}
		
	
		
	
		
	}

	
	
}


