public class RegularCustomer extends Customer {
    public RegularCustomer(Discount discount) {
        super(discount);
    }

    @Override
    public double getDiscountedPrice(double price) {
        return discount.applyDiscount(price);
    }
}