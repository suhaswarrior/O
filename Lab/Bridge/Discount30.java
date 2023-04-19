
public class Discount30 implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7;
    }
}
