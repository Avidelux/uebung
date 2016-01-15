package uebung;

public class Uebung {
	
	public static void main( String[] args) {
		
		int [] [] Ar = new int [3] [3];
		
		Ar [0] [0] = 1;
		Ar [1] [0] = 2;
		Ar [0] [1] = 3;
		Ar [2] [1] = 4;
		Ar [1] [2] = 5;
		Ar [0] [2] = 6;
		Ar [2] [0] = 7;
		Ar [2] [2] = 8;
		Ar [1] [1] = 9;
		
		
		
		
		
		
		for (int i = 0 ; i<Ar.length; i++){
			
			
		
			for (int j = 0 ; j<Ar[i].length; j++){	
			System.out.println(Ar[i][j]);
			
			}
		}
		
	
		System.out.println();
	
	
	
	}

  }
