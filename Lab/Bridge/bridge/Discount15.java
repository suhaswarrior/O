public class Discount15 implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}