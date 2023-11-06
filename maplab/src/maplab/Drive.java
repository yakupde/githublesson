package maplab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Drive {
	
	public static void main(String[] args) {
		
		
		File file2=new File("sozluk.txt");
		File file=new File("bulmaca.txt");
		try {
			if (!file2.exists()) {
				
			
			file2.createNewFile();}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		
		try {
			fileReader=new FileReader(file);
			
			bufferedReader=new BufferedReader(fileReader);
			
			String line=null;
			while ((line=bufferedReader.readLine())!=null) {
				
				String String[]=line.split(":");
				
				System.out.println(String[0]);
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
			e.printStackTrace();
		}
		finally {
			try {
			if (fileReader!=null)fileReader.close();
			if (bufferedReader!=null) bufferedReader.close(); 
		}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}


