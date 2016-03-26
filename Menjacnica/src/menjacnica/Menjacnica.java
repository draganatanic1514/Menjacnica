package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(Valuta valuta, double prodajniKurs, double kupovniKurs, double srednjiKurs,
			GregorianCalendar datum) {
		
	}

	@Override
	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {

	}

	@Override
	public Kurs vratiKurs(Valuta valuta, GregorianCalendar datum) {
		return null;
	}

}
