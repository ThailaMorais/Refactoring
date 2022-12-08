import java.util.Enumeration;

class TextStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = "" + aCustomer.getName() +
      "\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += each.getMovie().getTitle()+ ":" +
         String.valueOf(each.getCharge()) + "\n";
      }
      //add footer lines
      result += "" +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "" +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "";
      return result;
   }
}
