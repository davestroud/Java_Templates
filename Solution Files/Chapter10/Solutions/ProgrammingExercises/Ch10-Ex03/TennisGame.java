public class TennisGame
{
   private String player1;
   private String player2;
   private int score1;
   private int score2;
   private String score1String;
   private String score2String;
   public void setNames(String n1, String n2)
   {
      player1 = n1;
      player2 = n2;
   }
   public void setScores(int s1, int s2)
   {
       final String[] CALLS = {"love", "15", "30", "40", "game"};
       if(s1 < 0 || s1 > 4 || s2 < 0 || s2 > 4 ||(s1 == 4 && s2 == 4))
       {
          score1 = 0;
          score2 = 0;
          score1String = "error";
          score2String = "error";
       }
       else
       {
          score1 = s1;
          score2 = s2;
          score1String = CALLS[score1];
          score2String = CALLS[score2];
       }
   }
   public int getScore1()
   {
      return score1;
   }
   public int getScore2()
   {
      return score2;
   }
   public String getPlayer1()
   {
      return player1;
   }
   public String getPlayer2()
   {
      return player2;
   }
   public String getScore1String()
   {
      return score1String;
   }
   public String getScore2String()
   {
      return score2String;
   }
}
