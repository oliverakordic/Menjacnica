package paket.intefrejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursNaDan(GregorianCalendar dan, double kurs);
	public void brisiKursNaDan(GregorianCalendar dan);
	public double vratiKursNaDan(GregorianCalendar dan);
}
