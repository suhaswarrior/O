public class Discount {
 private String description;
 private double percentage;

 public Discount(String description, double percentage) {
     this.description = description;
     this.percentage = percentage;
 }

 public String getDescription() {
     return description;
 }

 public double getPercentage() {
     return percentage;
 }
}
