import java.util.*;
public class Ansatt extends Kort{
	
	@Override
	boolean sjekkPIN(int pin) {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();
		
		day = date.get(Calendar.DAY_OF_MONTH);
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		if(hour>=7 && hour<=17 && !isSperret() && pin!=9999){
			return true;
		}
		return false;
	}
	

}
class Gjest extends Kort{
	Date issueData;
	public Gjest(){
		pin =9999;
		issueData = new Date();
	}
	@Override
	boolean sjekkPIN(int pin) {
		Date currentDate = new Date();
		int diffInDays = (int) ((currentDate.getTime() - issueData.getTime()) / (1000 * 60 * 60 * 24));
		if(pin ==9999 && diffInDays <=7 && (!isSperret())){
			return true;
		}
		return false;
	}
}


