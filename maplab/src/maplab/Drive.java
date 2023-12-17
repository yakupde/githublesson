package maplab;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
public class Drive {
	
	public static void main(String[] args) {
		
		File file=new File("bulmaca.txt");
	
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		
		try {
			fileReader=new FileReader(file);
			
			bufferedReader=new BufferedReader(fileReader);
			
			String line=null;
			
			SortedMap<String, String>sortedMap=new TreeMap<>();
						
		while ((line=bufferedReader.readLine())!=null) {
				
				String String[]=line.split(":");
				
				//System.out.println(String[0]);*/
		
			
				sortedMap.put(String[0], String[1]);
				
				
			}			
		System.out.println(sortedMap.size());
		
		sortedMap.entrySet();
		java.util.Map.Entry<String, String> entrySet=(java.util.Map.Entry<String, String>) sortedMap.entrySet();
		Iterator<java.util.Map.Entry<String, String>>iterator=((Set<java.util.Map.Entry<String, String>>) entrySet).iterator();
		
		while (iterator.hasNext()) {
			entrySet=iterator.next();
			
			
			iterator.next();+
			
			
			
			
			System.out.println();
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


