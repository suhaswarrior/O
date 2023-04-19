
public class SeniorCitizenDiscount implements PricingStrategy{
	@Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.10;
    }
}
