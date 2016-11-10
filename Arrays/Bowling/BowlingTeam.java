public class BowlingTeam {

  private String teamName;  // Create a field for the name
  private String[] members = new String[4]; // Create an array holding team members

  // Create get and set methods for teamName field.
  public void setTeamName(String team)
  {
    teamName = team;
  }
  public String getTeamName()
  {
    return teamName;
  }

  // Add a method that sets team members name.
  // The method requires a position and a name.
  // Uses position as subscript to members array
  public void setMember(int number,String name)
  {
    members[number] = name;
  }

  // Add a method that returns a team memebers name.
  // The method requires a value usees as a subscript that
  // determines which members name to return.
  public String getMember(int number)
  {
    return members[number];
  }
}
