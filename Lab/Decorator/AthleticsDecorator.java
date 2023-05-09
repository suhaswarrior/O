class AthleticsDecorator extends SportsStockDecorator {
 public AthleticsDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 10;
 }
}
