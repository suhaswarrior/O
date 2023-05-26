public abstract class Customer {
    protected Discount discount;

    public Customer(Discount discount) {
        this.discount = discount;
    }

    public abstract double getDiscountedPrice(double price);
}




