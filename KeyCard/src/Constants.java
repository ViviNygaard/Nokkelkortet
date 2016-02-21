import java.util.Calendar;
import java.util.GregorianCalendar;

 interface Constants {

	void setFirstname(String firstName);
	   String getFirstname();
	   void setLastname(String lastName);
	   String getLastname();
	   void setFullName(String fullName);
	   String getFullName();
	   double computeCredit();
	   double computeBonus();
	}

	class Employee extends Card implements Constants{

	   double salaryPerHe;
	   GregorianCalendar issueData ;
	   public Employee() {
	       salaryPerHe =123.43;
	       issueData = new GregorianCalendar();
	   }
	   @Override
	   boolean checkPIN(int pin) {
	       int day, month, year;
	   int second, minute, hour;
	   GregorianCalendar date = new GregorianCalendar();
	   year = date.get(Calendar.YEAR);
	   day = date.get(Calendar.DAY_OF_MONTH);
	     
	   second = date.get(Calendar.SECOND);
	   minute = date.get(Calendar.MINUTE);
	   hour = date.get(Calendar.HOUR);
	   if(hour>=7 && hour<=17 && !isCancelled() && pin!=9999){
	       return true;  
	   }
	       return false;
	   }

	   @Override
	   public void setFirstname(String firstName) {
	       this.firstName= firstName;
	   }

	   @Override
	   public String getFirstname() {
	       return firstName;
	   }

	   @Override
	   public void setLastname(String lastName) {
	       this.lastName =lastName;
	   }

	   @Override
	   public String getLastname() {
	       return lastName;
	   }

	   @Override
	   public void setFullName(String fullName) {
	       String names[] = fullName.split("\\s+");
	       firstName = names[0];
	       lastName=names[1];
	   }

	   @Override
	   public String getFullName() {
	       return firstName+" "+lastName;
	   }

	   @Override
	   public double computeCredit() {
	       return salaryPerHe*45; // constant 45
	   }

	   @Override
	   public double computeBonus() {
	       GregorianCalendar date = new GregorianCalendar();
	   int currentYear = date.get(Calendar.YEAR);
	   int startYear = issueData.get(Calendar.YEAR);
	  
	       return (currentYear-startYear)*45; // 45 constant
	   }
	     
	}
