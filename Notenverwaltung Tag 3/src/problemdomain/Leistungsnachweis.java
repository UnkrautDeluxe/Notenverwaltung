package problemdomain;

abstract public class Leistungsnachweis {
	private String datum;
	private boolean noteVorhanden;
	public Leistungsnachweis(String d){
		datum = d;
		noteVorhanden = false;		
	}
	
	abstract public double getNote();
	public String getDatum(){
		return datum;
	}
	protected void setNoteVorhanden(){
		noteVorhanden = true;
	}
	public boolean getNoteVorhanden(){
		return noteVorhanden;
	}
	public boolean pruefeNote(double note){
		return note>=1.0 && note<=6.0;
	}
	public String toString(){
		if(getNoteVorhanden()){
			return "Leistungsnachweis.java vom " + getDatum() +	" mit Note " + getNote();
		} else {
			return "Leistungsnachweis.java vom " + getDatum() + " ohne Note!";			
		}
	}

}
