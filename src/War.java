
     import java.util.ArrayList;
public class War{
  public static void main(String[] args){
    //create new deck, stacks, and hands
    CardDeck deck = new CardDeck();
    CardList stack1 = new CardList();
    CardList stack2 = new CardList();
    CardList hand1 = new CardList();
    CardList hand2 = new CardList();
    
    //shuffle deck
    deck.shuffle();
    
    //deal cards to each hand 
    for(int i= 0; i <26; i++){
      hand1.addCardToTop(deck.takeCardFromTop());
    }
    for(int i=0; i < 26; i++){
      hand2.addCardToTop(deck.takeCardFromTop());
    }
    int round = 1;
    // while both still have cards, 
    while(hand1.size()>0 && hand2.size()>0)
    {
      System.out.println(hand1.size()+" ---round "+round+"--- "+hand2.size());
      Card c1 = hand1.takeCardFromTop();
      stack1.addCardToTop(c1);
      Card c2 = hand2.takeCardFromTop();
      stack2.addCardToTop(c2);
      System.out.println("   "+c1.toString()+":"+c2.toString());
      if(c1.compareTo(c2) >0)
      {
        hand1.addCardToBottom(c1);
        hand1.addCardToBottom(c2);
        stack1.remove(0);
        stack2.remove(0);
      }
      else if(c1.compareTo(c2)< 0)
      {
        hand2.addCardToBottom(c1);
        hand2.addCardToBottom(c2);
        stack2.remove(0);
        stack1.remove(0);
      }
      else
      {
        
        while(stack1.get(0).compareTo( stack2.get(0))== 0)
        {
          if(hand1.size()<2)
          {
            System.out.println("Player Two Wins!");
            for( int i =0; i<hand1.size(); i=0)
            {
              stack1.addCardToBottom(hand1.takeCardFromTop());
            }
            break;
          }
          else if(hand2.size()<2)
          {
            System.out.println("Player One Wins!");
            for( int i = 0; i<hand2.size(); i=0)
            {
              stack2.addCardToBottom(hand2.takeCardFromTop());
            }
            break;
          }
          
          System.out.println("War!!!");
          stack1.addCardToTop(hand1.takeCardFromTop());
          stack1.addCardToTop(hand1.takeCardFromTop());
          stack2.addCardToTop(hand2.takeCardFromTop());
          stack2.addCardToTop(hand2.takeCardFromTop());
          System.out.println("   "+stack1.get(0).toString()+":"+stack2.get(0).toString());
        }
        if((stack1.get(0)).compareTo( stack2.get(0)) >0 && hand1.size()>0 && hand2.size()>0)
        {
          System.out.println("P1 wins!!");
          for(int i=0; i<stack1.size(); i=0)
          {
            hand1.addCardToBottom(stack1.get(0));
            stack1.remove(0);
            hand1.addCardToBottom(stack2.get(0));
            stack2.remove(0);
          }
        }
        else if(stack1.get(0).compareTo(stack2.get(0))< 0 && hand1.size()>0 && hand2.size()>0)
        {
          System.out.println("P2 Wins!!!");
          for(int i=0; i<stack1.size(); i=0)
          {
            hand2.addCardToBottom(stack1.get(0));
            stack1.remove(0);
            hand2.addCardToBottom(stack2.get(0));
            stack2.remove(0);
          }
        }
      }
      round++;
    }
  }
}
