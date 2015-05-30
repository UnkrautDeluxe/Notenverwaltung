package problemdomain;

public class Referat extends Leistungsnachweis {
	private double noteVortrag;
	private double noteHandout;
	private double gewichtHandout;
	public Referat(String d, double gH){ // datum, gewichtHandout
		super(d);
		setGewicht(gH);
	}
	public Referat(String d, double gH, double nV, double nH){ // plus 2 Noten
		super(d);
		setGewicht(gH);
		setNoten(nV, nH);
	}
	public void setNoten(double nV, double nH){
		if(!pruefeNote(nV) || !pruefeNote(nH)){
			throw new IllegalArgumentException("Falsche Note");			
		}
		noteVortrag = nV;
		noteHandout = nH;
		setNoteVorhanden();
	}
	public double getNote(){
		return noteVortrag*(1.0-gewichtHandout)+noteHandout*gewichtHandout;
	}
	public String toString(){ // ergänzt um Details
		return super.toString() + "(Referat.java) vom Typ Referat" +
				"\nGewicht Handout: " + getGewichtHandout() + 
				"\nNote Vortrag: " +	getNoteVortrag() +
				"\nNote Handout: " + getNoteHandout() + "\n";
	}
	// die ¸brigen einfachen get-Methoden
	public double getGewichtHandout(){ 
		return gewichtHandout;
	}
	public double getNoteHandout(){
		return noteHandout;
	}
	public double getNoteVortrag(){
		return noteVortrag;
	}
	private void setGewicht(double gH){
		if(pruefeGewicht(gH)){
			gewichtHandout = gH;
		} else {
			throw new IllegalArgumentException("Falsches Referat-Gewicht");
		}
	}
	private boolean pruefeGewicht(double g){
		return g>=0.0 && g<=1.0;
	}
}
