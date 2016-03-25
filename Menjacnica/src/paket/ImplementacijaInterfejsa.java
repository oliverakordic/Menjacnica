package paket;

import java.util.GregorianCalendar;


public class ImplementacijaInterfejsa {
	Kurs k = new Kurs();
	
	public void dodajKursNaDan(GregorianCalendar dan, double kurs){
		k.setDatum(dan);
		k.setProdajniKurs(kurs);
	}
	public void brisiKursNaDan(GregorianCalendar dan){
		if(k.getDatum().equals(dan))
			k.setProdajniKurs(0);
	}
	public double vratiKursNaDan(GregorianCalendar dan){
		if(k.getDatum().equals(dan))
			return k.getProdajniKurs();
		return 0;
	}

}
