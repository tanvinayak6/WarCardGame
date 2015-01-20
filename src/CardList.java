// create class CardList
import java.util.ArrayList;
import java.util.Random;
public class CardList
{
  private ArrayList<Card> list;
  private Random random;
  
  public CardList()
  {
    list= new ArrayList<Card>();
    random= new Random();
  }
  public Card get(int index){
    return list.get(index);
  }
  public int size(){
    return list.size();
  }
  public void addCardToBottom(Card c)
  {
    list.add(c);
  }
  public void addCardToTop(Card c)
  {
    list.add(0, c);
  }
  public Card takeCardFromTop()
  {
    Card c= list.get(0);
    list.remove(0);
    return c;
  }
  public int removeRandomCard()
  {
    int randCardNum= random.nextInt(list.size());
    list.remove(randCardNum);
    return randCardNum;
  }
}
