import java.util.Calendar;
import java.util.GregorianCalendar;

interface Konstanter {
	
	void setFornavn(String forNavn);
	String getFornavn();
	void setEtternavn(String etterNavn);
	String getEtternavn();
	void setFulltNavn(String fulltNavn);
	String getFulltNavn();
	double beregnKreditt();
	double beregnBonus();
}
class Ansatt extends Kort implements Konstanter{
	
	double timeLonn;
	GregorianCalendar issueData ;
	public Ansatt() {
		timeLonn =123.43;
		issueData = new GregorianCalendar();
	}
	@Override
	boolean sjekkPIN(int pin) {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();
		year = date.get(Calendar.YEAR);
		day = date.get(Calendar.DAY_OF_MONTH);
		
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		if(hour>=7 && hour <=17 && !isSperret() && pin!=9999){
			return true;
			}
		return false;
	}
	@Override
	public void setFornavn(String forNavn){
		this.forNavn= forNavn;
	}
	@Override
	public String getFornavn() {
		return forNavn;
	}
	@Override
	public void setEtternavn(String etterNavn) {
		this.etterNavn =etterNavn;
	}
	@Override
	public String getEtternavn() {
		return etterNavn;
	}
	@Override
	public void setFulltNavn(String fulltNavn) {
		String names[] = fulltNavn.split("\\s+");
		forNavn = names[0];
		etterNavn=names[1];
		}
	@Override
	public String getFulltNavn() {
		return forNavn+" "+etterNavn;
		}
	@Override
	public double beregnKreditt() {
		return timeLonn*45; // konstant 45
		}
	@Override
	public double beregnBonus() {
		GregorianCalendar date = new GregorianCalendar();
		int currentYear = date.get(Calendar.YEAR);
		int startYear = issueData.get(Calendar.YEAR);
		
		return (currentYear-startYear)*45; // 45 konstant
	}
}




