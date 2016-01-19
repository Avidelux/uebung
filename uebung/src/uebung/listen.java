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

public String toString (){
	if(next == null){
		return ""+inhalt;
	}
	else{
		return ""+inhalt+" "next.toString();
	}
}







}
