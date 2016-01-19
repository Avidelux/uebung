package uebung;

public class listekopf {
	private listen kopf;
	
	public listekopf (int wert){
		kopf = new listen (wert);
	}

	public void add(int wert){
		kopf.add( new listen (wert));
	}
	public int getGroesse(){
		return kopf.getGroesse(0);
	}
	public String toString(){
		return kopf.toString();
	}
}