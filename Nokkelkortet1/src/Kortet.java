
public abstract class Kortet implements Comparable<Kortet> {
	
	String forNavn;
	String etterNavn;
	int pin;
	long kortNummer;
	boolean aksessKode;
	static long kort = 1;
	
	public Kortet() {
		forNavn = "Ole";
		etterNavn = "Andersen";
		pin = 0;
		kortNummer = kort;
		kort++;
		aksessKode = false;
	}
	String getNavn(){
		return forNavn+" "+etterNavn;
		
	}
	abstract boolean sjekkPIN(int pin);
	
	@Override
	public String toString() {
		return "[Navn: "+forNavn+" "+etterNavn+",PIN: "+pin+",Kortnummer: "+kortNummer+",IsSperret: "+aksessKode+"]";
		}
	boolean isSperret(){
		return aksessKode;
	}
@Override
public int compareTo(Kortet o) {
	if(this.etterNavn.compareTo(o.forNavn) !=0)
		return -1;
	return this.forNavn.compareTo(o.forNavn);
}
}


