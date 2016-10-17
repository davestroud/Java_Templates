// UseStudent.java
// Chapter 11, Exercise 13
public class UseStudent
{
   public static void main(String[] args)
   {
      Student[] student= new Student[3];
      FullTime s0 =  new FullTime("Ned", true);
      PartTime s1 = new PartTime("Fred", false, 9);
      PartTime s2 = new PartTime("Ted", false, 6);

      student[0] = s0;
      student[1] = s1;
      student[2] = s2;

      for(int i = 0; i < student.length; i++)
      {
         student[i].figureTuition();
         student[i].getStatus();
      }
   }
}

