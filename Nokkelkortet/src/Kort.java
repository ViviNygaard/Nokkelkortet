
public abstract class Kort {

	String forNavn;
	String etterNavn;
	int pin;
	long kortNummer;
	boolean aksessKode;
	static long kort = 1;
	
	public Kort() {
		forNavn = "Ole";
		etterNavn = "Andersen";
		pin =1120;
		kortNummer = kort;
		kort++;
		aksessKode = false;
	}
	String getNavn(){
		return forNavn + " "+etterNavn;
		}
	abstract boolean sjekkPIN(int pin);
	
	@Override
	public String toString() {
		return "[Navn: "+forNavn+" "+etterNavn+",PIN: "+pin+",Kortnummer: "+kortNummer+",IsSperret: "+aksessKode+"]";
	}
	boolean isSperret(){
		return aksessKode;
	}
}

