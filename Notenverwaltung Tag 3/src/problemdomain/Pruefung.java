package problemdomain;

public class Pruefung extends Leistungsnachweis {
	private double note;
	public Pruefung(String d){
		super(d); // Leistungsnachweis(d)
	}
	public Pruefung(String d, double n){
		super(d);
		setNote(n);
	}
	public void setNote(double n){
		if(!pruefeNote(n)){
			throw new IllegalArgumentException("Falsche Prüfungs-Note");
		}
		note = n;
		setNoteVorhanden();
	}
	public double getNote(){
		return note;
	}
	public String toString(){
			return super.toString() + " vom Typ Pruefung";
	}

}
