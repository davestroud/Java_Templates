import java.util.*;
public class DemoTennisGames
{
   public static void main(String[] args)
   {
      TennisGame tg1 = new TennisGame();
      TennisGame tg2 = new TennisGame();   
      TennisGame tg3 = new TennisGame();
      TennisGame tg4 = new TennisGame();
      DoublesTennisGame tg5 = new DoublesTennisGame();
      DoublesTennisGame tg6 = new DoublesTennisGame();
      DoublesTennisGame tg7 = new DoublesTennisGame();
      DoublesTennisGame tg8 = new DoublesTennisGame();
      tg1 = setTGame(tg1, "Amy", "Bill", 4, 2);
      tg2 = setTGame(tg2, "Carl", "Debbie", 0, 0);
      tg3 = setTGame(tg3, "Emily", "Frank", 5, 3);
      tg4 = setTGame(tg4, "George", "Hannah", 3, 0);
      tg5 = setDTGame(tg5, "Irene", "Jill", "Ken", "Larry", 4, 1);
      tg6 = setDTGame(tg6, "Mike", "Nick", "Olivia", "Pam", 5, 1);
      tg7 = setDTGame(tg7, "Quentin", "Rob", "Sandra", "Teresa", 4, 4);
      tg8 = setDTGame(tg8, "Ursela", "Violet", "Will", "Xander", 3, 0);
      displayTG(tg1);
      displayTG(tg2);
      displayTG(tg3);
      displayTG(tg4);
      displayDTG(tg5); 
      displayDTG(tg6);  
      displayDTG(tg7);  
      displayDTG(tg8);
   }    

   public static TennisGame setTGame(TennisGame tg, String n1, String n2, int score1, int score2)
   {
      tg.setNames(n1, n2);
      tg.setScores(score1, score2);
      return tg;
   }
   public static DoublesTennisGame setDTGame(DoublesTennisGame tg, String n1, String n2, String n3, String n4, int score1, int score2)
   {
      tg.setNames(n1, n3, n2, n4);
      tg.setScores(score1, score2);
      return tg;
   }
   public static void displayTG(TennisGame tg)
   {
      System.out.println("\nTennis game between two players");
      System.out.println(tg.getPlayer1() + " and " + tg.getPlayer2());
      displayScores(tg);
   }
   public static void displayScores(TennisGame tg)
   {
      System.out.println("Score: " + tg.getScore1() + " to " + tg.getScore2());
      System.out.println("Score: " + tg.getScore1String() + " to " + tg.getScore2String()); 
   }
   public static void displayDTG(DoublesTennisGame tg)
   {
      System.out.println("\nTennis game between four players");
      System.out.println(tg.getPlayer1() + " and " + tg.getPlayer1Partner());
      System.out.println("and " + tg.getPlayer2() + " and " + tg.getPlayer2Partner());
      displayScores(tg);
   }
}