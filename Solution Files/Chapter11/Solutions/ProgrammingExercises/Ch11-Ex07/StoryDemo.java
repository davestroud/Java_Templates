public class StoryDemo
{
   public static void main(String[] args)
   {
      Story stories[] = new Story[7];
      int i;
      stories[0] = new ShortStory();
      stories[1] = new ShortStory();
      stories[2] = new Novella();
      stories[3] = new Novella();
      stories[4] = new Novella();
      stories[5] = new Novel();
      stories[6] = new Novel();
      stories[0].setTitle("The Pit and the Pendulum");
      stories[0].setAuthor("E. A. Poe");
      stories[0].setPages(30);
      stories[1].setTitle("The Gift of the Magi");
      stories[1].setAuthor("O. Henry");
      stories[1].setPages(52);
      stories[2].setTitle("The Old Man and the Sea");
      stories[2].setAuthor("E. Hemingway");
      stories[2].setPages(97);
      stories[3].setTitle("Of Mice and Men");
      stories[3].setAuthor("J. Steinbeck");
      stories[3].setPages(107);
      stories[4].setTitle("Goodbye, Columbus");
      stories[4].setAuthor("P. Roth");
      stories[4].setPages(46);
      stories[5].setTitle("Breakfast at Tiffany's");
      stories[5].setAuthor("T. Capote");
      stories[5].setPages(120);
      stories[6].setTitle("Animal Farm");
      stories[6].setAuthor("G. Orwell");
      stories[6].setPages(98);
      
      for(i = 0; i < stories.length; ++i)
         System.out.println("\nWe are publishing the story " +
            stories[i].getTitle() +
            " by " + stories[i].getAuthor() +
            ".\n   The story has " +
            stories[i].getPages() + " pages." +
            stories[i].getMessage());
   }
}