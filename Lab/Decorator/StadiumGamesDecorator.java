class StadiumGamesDecorator extends SportsStockDecorator {
 public StadiumGamesDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 60;
 }
}
