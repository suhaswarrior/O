class CourtGamesDecorator extends SportsStockDecorator {
 public CourtGamesDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 30;
 }
}
