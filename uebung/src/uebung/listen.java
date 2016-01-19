package uebung;

public class listen {

	private int inhalt;
	private listen next;
	
	public listen (int inhalt){
		this.inhalt=inhalt;
	}
	
	public void add(listen neu){
		if(next==null){
			next=neu;
			}
		else {
			next.add(neu);
			
			}
	}

	public int getGroesse(int anzahl){
		 int zahl = anzahl+1;
		 if(next!=null){
			return next.getGroesse(zahl);}
		 
		 return zahl;
			 
		 }
	
public String toString (){
	if(next == null){
		return ""+inhalt;
	}
	else{
		return ""+inhalt+" "+next.toString();
	}
}







}
