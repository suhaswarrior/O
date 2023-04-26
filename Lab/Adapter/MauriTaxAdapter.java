public class MauriTaxAdapter implements TaxCalculator {
 private MauriTax mauriTax;

 public MauriTaxAdapter(MauriTax mauriTax) {
     this.mauriTax = mauriTax;
 }

 @Override
 public double calculateTax(double amount) {
     return mauriTax.getVAT(amount);
 }
}
