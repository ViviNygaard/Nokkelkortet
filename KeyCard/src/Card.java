
public abstract class Card {

	String firstName;
	   String lastName;
	   int pin;
	   long cardNumber;
	   boolean accessCode;
	   static long card = 1;
	  
	   public Card() {
	       firstName = "Alex";
	       lastName = "Mitti";
	       pin =1120;
	       cardNumber = card;
	       card++;
	       accessCode = false;
	   }
	   String getName(){
	       return firstName + " "+lastName;
	   }
	   abstract boolean checkPIN(int pin);
	  
	   @Override
	   public String toString() {
	       return "[Name: "+firstName+" "+lastName+",PIN: "+pin+",Card Number: "+cardNumber+",IsCancelled: "+accessCode+"]";
	   }
	  
	   boolean isCancelled(){
	       return accessCode;
	   }
	  
	}


