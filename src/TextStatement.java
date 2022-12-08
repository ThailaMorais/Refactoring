import java.util.Enumeration;

class TextStatement extends Statement {
   public String statement (Enumeration<Rental> rentals, Customer aCustomer) {
     
	      String result = "Rental Record for " + aCustomer.getName() + "\n";
	      
	      while (rentals.hasMoreElements()) {
	         Rental each = (Rental) rentals.nextElement();
	         //show figures for this rental
	         result += each.getMovie().getTitle()+ ":" + String.valueOf(each.getCharge()) + "\n";
	      }
	      //add footer lines
	      result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
	      result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "";
	      
	      return result;
	   }
}
