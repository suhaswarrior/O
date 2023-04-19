
public class Main {
	public static void main(String[] args) {
        StoreLevelDiscount storeLevelDiscount = new StoreLevelDiscount(100);
        PricingStrategy regularStrategy = new RegularCustomerDiscount();
        PricingStrategy seniorStrategy = new SeniorCitizenDiscount();
        PricingStrategy firstTimeStrategy = new FirstTimeCustomerDiscount();

        Checkout checkout = new Checkout(regularStrategy, storeLevelDiscount);
        double totalForRegular = checkout.calculateTotal(2500);
        System.out.println("Total for regular customer: " + totalForRegular);

        checkout.setPricingStrategy(seniorStrategy);
        double totalForSenior = checkout.calculateTotal(2500);
        System.out.println("Total for senior citizen: " + totalForSenior);

        checkout.setPricingStrategy(firstTimeStrategy);
        double totalForFirstTime = checkout.calculateTotal(2500);
        System.out.println("Total for first-time customer: " + totalForFirstTime);
    }
}
