public class Main {
 public static void main(String[] args) {
     System.out.println();
     SportsStock indoorStock = new IndoorSports();
     SportsStock outdoorStock = new OutdoorSports();
     
     SportsStock gamesOnTableStock = new GamesOnTableDecorator(indoorStock);
     SportsStock boardGamesStock = new BoardGamesDecorator(indoorStock);
     SportsStock courtGamesStock = new CourtGamesDecorator(indoorStock);
     
     SportsStock adventureGamesStock = new AdventureGamesDecorator(outdoorStock);
     SportsStock stadiumGamesStock = new StadiumGamesDecorator(outdoorStock);
     SportsStock athleticsStock = new AthleticsDecorator(outdoorStock);
     
     System.out.println("Games on Table Stock: " + gamesOnTableStock.getCurrentStock());
     System.out.println("Board Games Stock: " + boardGamesStock.getCurrentStock());
     System.out.println("Court Games Stock: " + courtGamesStock.getCurrentStock());
     
     System.out.println("Adventure Games Stock: " + adventureGamesStock.getCurrentStock());
     System.out.println("Stadium Games Stock: " + stadiumGamesStock.getCurrentStock());
     System.out.println("Athletics Stock: " + athleticsStock.getCurrentStock());
     System.out.println();
 }
}
