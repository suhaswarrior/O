abstract class SportsStockDecorator implements SportsStock {
 protected SportsStock decoratedSportsStock;

 public SportsStockDecorator(SportsStock decoratedSportsStock) {
     this.decoratedSportsStock = decoratedSportsStock;
 }

 public int getCurrentStock() {
     return decoratedSportsStock.getCurrentStock();
 }
}
