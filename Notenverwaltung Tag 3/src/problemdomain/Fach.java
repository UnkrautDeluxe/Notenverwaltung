package problemdomain;

import java.util.ArrayList;
import java.util.List;

public class Fach {
	private String bezeichnung;
	private int gewicht;
	private List<Leistungsnachweis> leistungsnachweise;
	
	public Fach (String bezeichnung, int gewicht){
		
		this.bezeichnung = bezeichnung;
		this.gewicht = gewicht;
		leistungsnachweise = new ArrayList<Leistungsnachweis>();
	}
	public void initFach() {
		if(!pruefeGewicht(this.getGewicht())){
			throw new IllegalArgumentException("Falsches Gewicht");
		}
	}
	public void neuePruefungHinzufuegen(String datum){ // Pruefung p
		Pruefung p = new Pruefung(datum);
		leistungsnachweise.add(p);
	}
	public void neuePruefungHinzufuegen(Pruefung p){ // Pruefung p
		leistungsnachweise.add(p);
	}
	public void neuePruefungHinzufuegen(String datum, double note){
		Pruefung p = new Pruefung(datum, note);
		leistungsnachweise.add(p);		
	}
	// 2 Methoden neuesReferatHinzufuegen() analog zu den beiden vorstehenden und
	//                                      entsprechend den beiden Konstruktoren
	public void neuesReferatHinzufuegen(String d, double gH){
		Referat r = new Referat(d, gH);
		leistungsnachweise.add(r);
	}
	public void neuesReferatHinzufuegen(String d, double gH, double nV, double nH){
		Referat r = new Referat(d, gH, nV, nH);
		leistungsnachweise.add(r);		
	}
	// 2 Methoden neuesSportHinzufuegen() analog zu den beiden vorstehenden und
	//                                      entsprechend den beiden Konstruktoren
	public void neuesSportHinzufuegen (String d, double n1, double n2, double n3, double n4, double n5){
		Sport s = new Sport(d, n1, n2, n3, n4, n5);
		leistungsnachweise.add(s);
	}
//	public void neuesSportHinzufuegen(String d, double n3, double n1, double n2){
//		Sport s = new Sport(d, n3, n1, n2);
//		leistungsnachweise.add(s);		
//	}
	public double getFachnote(){
		double notenSumme = 0.0;
		int notenAnzahl = 0;
		for(Leistungsnachweis l : leistungsnachweise){
			if(l.getNoteVorhanden()){
				notenSumme += l.getNote(); // = notenSumme + p.getNote()
				notenAnzahl++; // = notenAnzahl + 1
			}
		}
		if(notenAnzahl==0){
			return 0.0;
		}
		else {
			return notenSumme/notenAnzahl;
		}
	}
	public Pruefung getPruefung(String datum){
		Pruefung p = null;
		for(Leistungsnachweis l : leistungsnachweise){
			if(l.getDatum().equals(datum)){
				try {
					p = (Pruefung)l;
					return p;
				} catch(ClassCastException e){}
			}
		}
		return null;
	}
	// Methode getReferat analog zu getPruefung
	public Referat getReferat(String datum){
		Referat r = null;
		for(Leistungsnachweis l : leistungsnachweise){
			if(l.getDatum().equals(datum)){
				try {
					r = (Referat)l;
					return r;
				} catch(ClassCastException e){}
			}
		}
		return null;
	}
	// Methode getSport analog zu getPruefung
	public Sport getSport(String datum){
		Sport s = null;
		for(Leistungsnachweis l : leistungsnachweise){
			if(l.getDatum().equals(datum)){
				try {
					s = (Sport)l;
					return s;
				} catch(ClassCastException e){}
			}
		}
		return null;
	}
	public int getAnzahlLeistungsnachweise(){
		return leistungsnachweise.size();
	}
	public String getBezeichnung(){
		return bezeichnung;
	}
	public int getGewicht(){
		return gewicht;
	}
	public String toString(){
		return "Fach.java: " + getBezeichnung() +
			   "\n           Gewicht: " + getGewicht() +
			   "\n           Anzahl Leistungsnachweise: " + getAnzahlLeistungsnachweise() +
			   "\n           Fachnote: " + getFachnote() + "\n";

	}
	private boolean pruefeGewicht(int gewicht){
		return gewicht>0;
	}
}
