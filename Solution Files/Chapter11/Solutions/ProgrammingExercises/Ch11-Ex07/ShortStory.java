public class ShortStory extends Story
{
   public void setPages(int pages)
   {
      int tooLong;
      this.pages = pages;
      if(pages >= SHORT_STORY)
      {
         tooLong = pages - SHORT_STORY + 1;
         setMessage("\n   " + tooLong + " pages must be cut to qualify as a short story.");
      }
   }
}
