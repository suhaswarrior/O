
public class StoreLevelDiscount {
	private double storeDiscount;

    public StoreLevelDiscount(double storeDiscount) {
        this.storeDiscount = storeDiscount;
    }

    public double calculateStoreLevelDiscount(double totalAmount) {
        if (totalAmount > 2000) {
            return storeDiscount;
        }
        return 0;
    }
}
