import java.util.*;

public class Employee extends Card{
	
	 @Override
	   boolean checkPIN(int pin) {
	       int day, month, year;
	   int second, minute, hour;
	   GregorianCalendar date = new GregorianCalendar();
	     
	   day = date.get(Calendar.DAY_OF_MONTH);
	     
	   second = date.get(Calendar.SECOND);
	   minute = date.get(Calendar.MINUTE);
	   hour = date.get(Calendar.HOUR);
	   if(hour>=7 && hour<=17 && !isCancelled() && pin!=9999){
	       return true;  
	   }
	       return false;
	   }
	     
	}

	class Guest extends Card{
	   Date issueData;
	   public Guest(){
	       pin =9999;
	       issueData = new Date();
	   }
	   @Override
	   boolean checkPIN(int pin) {
	       Date currentDate = new Date();
	       int diffInDays = (int) ((currentDate.getTime() - issueData.getTime()) / (1000 * 60 * 60 * 24));
	       if(pin ==9999 && diffInDays <=7 && (!isCancelled())){
	           return true;
	       }
	       return false;
	   }
	     
	     
	
}

