public class Discount25 implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.75;
    }
}