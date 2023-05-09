class AdventureGamesDecorator extends SportsStockDecorator {
 public AdventureGamesDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 40;
 }
}
