public class RegularCustomerFactory implements CustomerFactory {
 @Override
 public Customer createCustomer() {
     return new RegularCustomer();
 }
}
