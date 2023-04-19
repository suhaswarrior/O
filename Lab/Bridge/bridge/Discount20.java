

public class Discount20 implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8;
    }
}
