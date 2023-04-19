
public class Checkout {
	private PricingStrategy pricingStrategy;
    private StoreLevelDiscount storeLevelDiscount;

    public Checkout(PricingStrategy pricingStrategy, StoreLevelDiscount storeLevelDiscount) {
        this.pricingStrategy = pricingStrategy;
        this.storeLevelDiscount = storeLevelDiscount;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotal(double totalAmount) {
        double customerDiscount = pricingStrategy.calculateDiscount(totalAmount);
        double storeDiscount = storeLevelDiscount.calculateStoreLevelDiscount(totalAmount);

        return totalAmount - customerDiscount - storeDiscount;
    }
}
