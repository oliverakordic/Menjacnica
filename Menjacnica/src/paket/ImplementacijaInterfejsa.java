package paket;

import interfejs.MenjacnicaInterfejs1;

import java.util.GregorianCalendar;
//import paket.intefrejs.MenjacnicaInterfejs;


public class ImplementacijaInterfejsa implements MenjacnicaInterfejs1{
	public void dodajKursNaDan(GregorianCalendar dan, double kurs){
		Kurs k = new Kurs();
		if(dan==null)
			return;
		k.setDatum(dan);
		k.setProdajniKurs(kurs);
	}
	public void brisiKursNaDan(GregorianCalendar dan){
		Kurs k = new Kurs();
		if(dan.equals(null))
			return;
		k.setProdajniKurs(0);
		
	}
	public double vratiKursNaDan(GregorianCalendar dan){
		Kurs k = new Kurs();
		if(dan.equals(null))
			return 0;
		return k.getProdajniKurs();
	}
}
