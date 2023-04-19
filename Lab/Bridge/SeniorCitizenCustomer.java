public class SeniorCitizenCustomer extends Customer {
    public SeniorCitizenCustomer(Discount discount) {
        super(discount);
    }

    @Override
    public double getDiscountedPrice(double price) {
        return discount.applyDiscount(price);
    }
}