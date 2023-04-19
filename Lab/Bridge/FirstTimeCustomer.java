
public class FirstTimeCustomer extends Customer {
    public FirstTimeCustomer(Discount discount) {
        super(discount);
    }

    @Override
    public double getDiscountedPrice(double price) {
        return discount.applyDiscount(price);
    }
}