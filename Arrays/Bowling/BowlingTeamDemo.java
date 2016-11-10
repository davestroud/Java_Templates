import java.util.*;
public class BowlingTeamDemo {

  public static void main(String[] args) {

    String name;  // String holding user input
    BowlingTeam bowlTeam = new BowlingTeam(); // BowlingTeam object
    int x;  // Integer used as a subscript

    // Constant that represents the number of
    // members on a bowling team
    final int NUM_TEAM_MEMBERS = 4;
    Scanner input = new Scanner(System.in);

    // Prompt the user for a bowling team name
    // Assign it to BowlingTeam object
    System.out.print("Enter team name >> ");
    name = input.nextLine();
    bowlTeam.setTeamName(name);

    // Loop prompts user for team members name.
    for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {

      System.out.print("Enter team member's name >> ");
      name = input.nextLine();  // Accept the name
      bowlTeam.setMember(x, name);  // Assign name to bowling team
                                    // object using subscript to indicate
                                    // team members position in the array
                                    // in the BowlingTeam class
    }
      // Display the details of the BowlingTeam object
      System.out.println("\nMembers of team " + bowlTeam.getTeamName());
      for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
        System.out.print(bowlTeam.getMember(x) + " ");
      System.out.println();
  }
}
