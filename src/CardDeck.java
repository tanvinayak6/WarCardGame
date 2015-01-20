// create class CardDeck that extends CardList
import java.util.ArrayList;
public class CardDeck extends CardList
{
  private int suits= 4;
  private int ranks= 13;
  private int swaps= 10000;
  
  public CardDeck()
  {
    Card temp;
    for( int s=1; s<= suits; s++)
    {
      for( int r=1; r<= ranks;r++)
      {
        temp= new Card(s, r);
        this.addCardToTop(temp);
      }
    }
  }
  public void shuffle()
  {
    for(int i=0; i<swaps; i++)
    {
      int c= removeRandomCard();
      addCardToBottom(get(c));
    }
  }
}
   
