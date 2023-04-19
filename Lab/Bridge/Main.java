public class Main {
    public static void main(String[] args) {
        Customer seniorCitizen = new SeniorCitizenCustomer(new Discount30());
        double seniorDiscountedPrice = seniorCitizen.getDiscountedPrice(100);
        System.out.println("Senior Citizen Discounted Price: " + seniorDiscountedPrice);

        Customer firstTimeCustomer = new FirstTimeCustomer(new Discount20());
        double firstTimeDiscountedPrice = firstTimeCustomer.getDiscountedPrice(100);
        System.out.println("First-Time Customer Discounted Price: " + firstTimeDiscountedPrice);

        Customer regularCustomer = new RegularCustomer(new Discount15());
        double regularDiscountedPrice = regularCustomer.getDiscountedPrice(100);
        System.out.println("Regular Customer Discounted Price: " + regularDiscountedPrice);
    }
}
