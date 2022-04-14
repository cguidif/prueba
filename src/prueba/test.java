package prueba;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


class test {
    
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        
        System.out.println("Ingrese cadena:");
        Scanner scan = new Scanner(System.in);
        String text = formatText(scan.nextLine());
        
        var splitted = text.split(" ");
               
        for (int i = 0; i < splitted.length; i++) {
        	
        	String word = splitted[i];
        	
			if (list.containsKey(word)) {
				list.replace(word, list.get(word)+1);
			}
			else {
				list.put(word, 1);
			}
		}

		System.out.println("sali...");

        scan.close();
        System.out.println(list);
                       
    }
    
    public static String formatText(String word) {
		return word.replaceAll("[\\.\\,\\/]", "")
				.replace("\\", "")
				.toLowerCase();
    }
}
