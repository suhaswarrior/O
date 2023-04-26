public class Customer implements Observer {
 private String name;

 public Customer(String name) {
     this.name = name;
 }

 @Override
 public void update(Discount discount) {
     System.out.println(name + " received discount notification: " + discount.getDescription() + " - " + discount.getPercentage() + "% off");
 }
}
