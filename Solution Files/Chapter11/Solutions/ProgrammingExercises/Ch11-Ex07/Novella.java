public class Novella extends Story
{
   public void setPages(int pages)
   {
      int tooLong;
      int tooShort;
      this.pages = pages;
      if(pages > NOVEL)
      {
         tooLong = pages - NOVEL;
         setMessage("\n   " + tooLong + " pages must be cut to qualify as a novella.");
      }
      if(pages < SHORT_STORY)
      {
         tooShort = SHORT_STORY - pages;
         setMessage("\n   " + tooShort + " pages must be added to qualify as a novella.");
      }
   }
}
