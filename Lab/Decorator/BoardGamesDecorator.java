class BoardGamesDecorator extends SportsStockDecorator {
 public BoardGamesDecorator(SportsStock decoratedSportsStock) {
     super(decoratedSportsStock);
 }

 public int getCurrentStock() {
     return super.getCurrentStock() + 20;
 }
}
