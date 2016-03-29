package paket;

import interfejs.MenjacnicaInterfejs1;

import java.util.GregorianCalendar;


public class ImplementacijaInterfejsa implements MenjacnicaInterfejs1{
	public void dodajKursNaDan(GregorianCalendar dan, double kurs){
		Kurs k = new Kurs();

		k.setDatum(dan);
		k.setProdajniKurs(kurs);
	}
	public void brisiKursNaDan(GregorianCalendar dan){

	}
	public double vratiKursNaDan(GregorianCalendar dan){
		return 0;
	}
}
