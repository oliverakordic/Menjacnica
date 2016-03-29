package interfejs;

import java.util.GregorianCalendar;

import paket.Kurs;

public interface MenjacnicaInterfejs1 {
	public void dodajKursNaDan(GregorianCalendar dan, double kurs);

	
	public void brisiKursNaDan(GregorianCalendar dan);
	public double vratiKursNaDan(GregorianCalendar dan);
}
