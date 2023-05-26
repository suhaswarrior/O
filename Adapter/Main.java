public class Main {
 public static void main(String[] args) {
   System.out.println();
     MauriTax mauriTax = new MauriTax();
     TaxCalculator taxCalculator = new MauriTaxAdapter(mauriTax);

     double amount = 100.0;
     double tax = taxCalculator.calculateTax(amount);

     System.out.println("Tax for amount " + amount + " is: " + tax);
 }
}
