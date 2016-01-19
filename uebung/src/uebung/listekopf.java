package uebung;

public class listekopf {
	private listen kopf;
	
	public listekopf (int wert){
		kopf = new listen (wert);
	}

	public void add(int wert){
		kopf.add( new listen (wert));
	}

}