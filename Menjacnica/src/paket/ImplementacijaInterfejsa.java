package paket;

import java.util.GregorianCalendar;


public class ImplementacijaInterfejsa {
	public void dodajKursNaDan(GregorianCalendar dan, double kurs){
		Kurs k = new Kurs();
		if(dan==null)
			return;
		k.setDatum(dan);
		k.setProdajniKurs(kurs);
	}
	public void brisiKursNaDan(GregorianCalendar dan){}
	public double vratiKursNaDan(GregorianCalendar dan){
		return 0;
	}
}
