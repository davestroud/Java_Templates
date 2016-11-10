import java.util.*;

public class AverageOfQuizzes {

  public static void main(String[] args) {

    int score = 0;
    int count = 0;
    int total = 0;
    final int QUIT = 999;
    final int MAX = 10;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a quiz score or " +
        QUIT + "to quit   >> ");
    score = input.nextInt();
    while(score != QUIT) {

      scores[count] = score;
      total += scores[count];
      ++count;
      if(count == MAX)
          score = QUIT;
      else {
        System.out.print("Enter next quiz score or " +
            QUIT + " to quit >> ");
        score = input + input.nextInt();
      }
    }
  }
}