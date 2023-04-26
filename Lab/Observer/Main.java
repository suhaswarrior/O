public class Main {
 public static void main(String[] args) {
     System.out.println();
     DecathlonStore store = new DecathlonStore();
     Customer alice = new Customer("Alice");
     Customer bob = new Customer("Bob");

     store.addObserver(alice);
     store.addObserver(bob);

     Discount newYearDiscount = new Discount("New Year Discount", 10);
     store.announceDiscount(newYearDiscount);
 }
}
