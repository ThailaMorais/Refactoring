import java.util.Enumeration;

class HtmlStatement extends Statement {
	   public String statement (Enumeration<Rental> rentals, Customer Customer) {	   
		   
		      String result = "<H1>Rentals for <EM" + Customer.getName() + "\n";
		      
		      while (rentals.hasMoreElements()) {
		         Rental each = (Rental) rentals.nextElement();
		         
		         //show figures for each rental
		         result += each.getMovie().getTitle()+ ":" +
		         String.valueOf(each.getCharge()) + "\n";
		      
		      }
		      
			      //add footer lines
			      result += "<P>You owe <EM>\"" + String.valueOf(Customer.getTotalCharge()) + "</EM><P>\n";
			      result += " On this rental you earned <EM> " + String.valueOf(Customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
			      
			      return result;
		   }
}