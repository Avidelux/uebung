package uebung;
import java.util.ArrayList;

public class ListeUebung {

	public static void main(String[] args) {
		ArrayList<String> liste  = new ArrayList<String>();
		liste.add("eins");
		liste.add("zwei");
		liste.add("drei");
		
		for (int i=0;i<liste.size(); i++){
			System.out.print(liste.get(i)+", ");
			
		}
		System.out.println();
		
		
		liste.set(0,"leib"); 
		
		for (int i=0;i<liste.size(); i++){
			System.out.print(liste.get(i)+", ");}
	}


	
}
