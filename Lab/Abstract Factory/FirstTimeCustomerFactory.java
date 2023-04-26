public class FirstTimeCustomerFactory implements CustomerFactory {
 @Override
 public Customer createCustomer() {
     return new FirstTimeCustomer();
 }
}