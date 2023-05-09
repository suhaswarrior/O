class GamesOnTableDecorator extends SportsStockDecorator {
 public GamesOnTableDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 50;
 }
}
