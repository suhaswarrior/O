public class SeniorCitizenCustomerFactory implements CustomerFactory {
 @Override
 public Customer createCustomer() {
     return new SeniorCitizenCustomer();
 }
}