public class Hand{

  public void main(Object card1, Object card2){
    Object[] handArray = {card1, card2};
  }

  public hit(){
    //add a card from the deck
  }
  
  public value(){
    int count = 0;
    for (int i; i < handArray.length; i++){
      count += handArray[i][0];
    return count;
    }
  } 
}