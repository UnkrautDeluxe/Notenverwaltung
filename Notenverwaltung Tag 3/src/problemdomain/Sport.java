package problemdomain;

public class Sport extends Leistungsnachweis {
	private double note1;
	private double note2;
	private double note3;
	private double note4;
	private double note5;
	
	public Sport (String d, double n1, double n2, double n3, double n4, double n5){
		super(d); // aus Leistungsnachweis(d)
//		note1 = n1;
//		note2 = n2;
//		note3 = n3;
//		note4 = n4;
//		note5 = n5;
		setNote(n1,n2,n3,n4,n5);
		setNoteVorhanden();
		
	}
	public void setNote (double n1, double n2, double n3, double n4, double n5){
		if(!pruefeNote(n1) || !pruefeNote(n2) || !pruefeNote(n3) || !pruefeNote(n4) || !pruefeNote(n5)){
			throw new IllegalArgumentException("Falsche Sport-Note");
		}
		note1 = n1;
		note2 = n2;
		note3 = n3;
		note4 = n4;
		note5 = n5;
		setNoteVorhanden();
	}
	public double getNote() {
		return (note1+note2+note3+note4+note5)/5;
	}
	public String toString(){
			return super.toString() + " vom Typ Sport";
	}
}
