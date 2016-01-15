package uebung;

public class Uebung {
	
	public static void main( String[] args) {
		
		int [] [] Ar = new int [100] [100];
		
		int x = 1;
		
		
		for (int i = 0 ; i<Ar.length; i++){
			for (int j = 0 ; j<Ar[i].length; j++){	
				Ar [i][j] = x;
				x++;
					}
		     }
			
		for (int i = 0 ; i<Ar.length; i++){
			for (int j = 0 ; j<Ar[i].length; j++){	
				System.out.print(Ar[i][j]+" ");
					}
		System.out.println();     
		}
			
			
			
		
		
		
		
		
		
		
	}

  }
