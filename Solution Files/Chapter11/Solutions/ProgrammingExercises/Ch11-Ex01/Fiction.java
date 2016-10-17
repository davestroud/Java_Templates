// Fiction.java
// Chapter 11, Exercise 1
public class Fiction extends Book
{
  public Fiction(String title)
  {
     super(title);
     setPrice();
  }
  public void setPrice()
  {
     super.price = 24.99;
  }

}
