public class Main {
 public static void main(String[] args) {
     System.out.println();
     CustomerFactory factory = new SeniorCitizenCustomerFactory();
     Customer customer = factory.createCustomer();
     System.out.println("Created Customer: " + customer.getCustomerType());
 }
}
