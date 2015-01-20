// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  public  String toString()
  {
    String suit=""+getSuit();
    if(getSuit()== 1)
    {
      suit = "H";
    }
    if(getSuit() == 2)
    {
      suit= "C";
    }
    if(getSuit() == 3)
    {
      suit = "D";
    }
    if(getSuit() == 4)
    {
      suit = "S";
    }
    String rank= ""+ getRank();
    if(getRank()== 11)
    {
      rank= "J";
    }
    if(getRank() == 12)
    {
      rank= "Q";
    }
    if(getRank() == 13)
    {
      rank= "K";
    }
    if(getRank() == 1)
    {
      rank= "A";
    }
    return suit+"-"+rank;
  }
  public int compareTo(Card card)
  {
    return getRank()- card.getRank();
  }
}
