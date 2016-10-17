public class Novel extends Story
{
   public void setPages(int pages)
   {
      int tooShort;
      this.pages = pages;
      if(pages < NOVEL)
      {
         tooShort = NOVEL - pages + 1;
         setMessage("\n   " + tooShort + " pages must be added to qualify as a novel.");
      }
   }
}
