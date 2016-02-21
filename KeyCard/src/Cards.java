
 public abstract class Cards implements Comparable<Cards> {

	  String firstName;
	   String lastName;
	   int pin;
	   long cardNumber;
	   boolean accessCode;
	   static long card = 1;
	  
	   public Cards() {
	       firstName = "Alex";
	       lastName = "Mitti";
	       pin = 0;
	       cardNumber = card;
	       card++;
	       accessCode = false;
	   }
	   String getName(){
	       return firstName+" "+lastName;
	   }
	   abstract boolean checkPIN(int pin);
	  
	   @Override
	   public String toString() {
	       return "[Name: "+firstName+" "+lastName+",PIN: "+pin+",Card Number: "+cardNumber+",IsCancelled: "+accessCode+"]";
	   }
	  
	   boolean isCancelled(){
	       return accessCode;
	   }
	  
	   @Override
	   public int compareTo(Cards o) {
	       if(this.lastName.compareTo(o.firstName) !=0)
	           return -1;
	       return this.firstName.compareTo(o.firstName);
	   }
	  
	  
	}
