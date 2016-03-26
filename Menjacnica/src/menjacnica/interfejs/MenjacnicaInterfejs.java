package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(Valuta valuta, double prodajniKurs, double kupovniKurs, 
			double srednjiKurs, GregorianCalendar datum);
	
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum);
	
	public Kurs vratiKurs(Valuta valuta, GregorianCalendar datum );
}
