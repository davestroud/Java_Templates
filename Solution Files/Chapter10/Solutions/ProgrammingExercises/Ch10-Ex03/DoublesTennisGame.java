public class DoublesTennisGame extends TennisGame
{
   private String player1Partner;
   private String player2Partner;
   public void setNames(String n1, String n2, String n3, String n4)
   {
      super.setNames(n1, n2);
      player1Partner = n3;
      player2Partner = n4;
   }
   public String getPlayer1Partner()
   {
      return player1Partner;
   }
   public String getPlayer2Partner()
   {
      return player2Partner;
   }
}