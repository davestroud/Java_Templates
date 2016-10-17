public abstract class Story
{
   public static final int SHORT_STORY = 50;
   public static final int NOVEL = 100;
   private String title;
   private String author;
   protected int pages;
   private String msg = "";
   public void setTitle(String title)
   {
      this.title = title;
   }
   public void setAuthor(String author)
   {
      this.author = author;
   }
   public void setMessage(String m)
   {
      msg = m;
   }
   public String getTitle()
   {
      return title;
   }
   public String getAuthor()
   {
      return author;
   }
   public int getPages()
   {
      return pages;
   }
   public String getMessage()
   {
      return msg;
   }
   public abstract void setPages(int pages);
}
