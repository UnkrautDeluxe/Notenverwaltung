package problemdomain; 

import problemdomain.Fach;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
	private String name;
	private String vorname;
	private int gebDatumTag;
	private int gebDatumMonat;
	private int gebDatumJahr;
	double notenSchnitt;
	private ArrayList<Fach> faecher;
	public Student (String n, String v, int t, int m, int j){
		this.name = n;
		this.vorname = v;
		this.gebDatumTag = t;
		this.gebDatumMonat = m;
		this.gebDatumJahr = j;
						if (!pruefeGebDatumTag(t)){
			throw new IllegalArgumentException("Tag ist falsch"); // Exception in the air :)
		}
		if (!pruefeGebDatumMonat(m)){
			throw new IllegalArgumentException("Monat ist falsch"); // Exception in the air :)
		}
		if (!pruefeGebDatumJahr(j)){
			throw new IllegalArgumentException("Jahr ist falsch"); // Exception in the air :)
		}
		this.faecher = new ArrayList<Fach>();
	}
	
	public void neuesFachHinzufuegen (String name, int note) {
		this.faecher.add(new Fach (name, note));
	}

	public boolean pruefeGebDatumTag (int t){
		return gebDatumTag >= 0 && gebDatumTag < 31;
	}
	public boolean pruefeGebDatumMonat (int m){
		return gebDatumMonat >= 0 && gebDatumMonat < 13;
	}
	public boolean pruefeGebDatumJahr (int j){
		return gebDatumJahr >= 1900 && gebDatumJahr < 2000;
	}	
	
	// Name und Vorname zurückgeben
	public void setName(String name) {
		this.name = name;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getName() {
		return name;
	}
	public String getVorname() {
		return vorname;
	}
	public int getGebDatumTag(){
		return gebDatumTag;
	}
	public int getGebDatumMonat(){
		return gebDatumMonat;
	}
	public int getGebDatumJahr(){
		return gebDatumJahr;
	}
	public int getAnzahlFaecher(){
		return faecher.size();
	}

	public Fach getFach(String bezeichnung) {
		for(Fach f : faecher) {
			if (f.getBezeichnung().equals(bezeichnung)) {
				return f;
			}
		}
		return null;
	}
	public double getNotenSchnitt2() {
		double notenSumme = 0;
		double gewichtSumme = 0;
		int faecherAnzahl = 0;
		DecimalFormat df = new DecimalFormat("#.#");
		for(Fach f : faecher) {
			notenSumme += (f.getGewicht() * f.getFachnote());
			gewichtSumme += f.getGewicht();
			faecherAnzahl++;
		}
		return (faecherAnzahl == 0) ? 0.0:Double.parseDouble(df.format(notenSumme/gewichtSumme));
	}
	
	public double getNotenSchnitt(){
		return faecher.size();
	}
	
	public String toString(){
		return "Student: " + getName() + " " + getVorname() + "\ngeboren am: " 
				+ getGebDatumTag() + "." + getGebDatumMonat() + "." + getGebDatumJahr() + 
				"\nAnzahl Fächer: " + getAnzahlFaecher() +
				"\nNotenschnitt: " + getNotenSchnitt2() +
				"\n\nNeue Zeile: " + getNotenSchnitt2();
		}
}
