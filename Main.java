public class Main{

    //Initalize resources for creating the deck
    static String[] suits = {"Diamond", "Heart", "Spade", "Club"};
    static Object[][] values = { {"One", 1},{"Two", 2},{"Three", 3},{"Four", 4},{"Five", 5},{"Six", 6},{"Seven", 7},{"Eight", 8},{"Nine", 9},{"Ten", 10},{"Jack", 10}, {"Queen", 10}, {"King", 10}, {"Ace", 11} };
    public static Object[][] deck = new Object[56][];

  
    static void shuffle(){
      int counter = 0;
      for (int i = 0; i < Main.suits.length; i++){
          for (int x = 0; x < Main.values.length; x++){
              // Creates a card object that is an array of {value, suit, value name}
              Object[][] cardInstance = {{Main.values[x][1], Main.suits[i], Main.values[x][0]}};
              // Adds created card to Main.deck
              System.arraycopy(cardInstance, 0, Main.deck, counter, cardInstance.length);
              counter++;
            }
        }
    }


    public static Object[] deckPop(int card){
// Create a copy a new array from the cards before and after the popped card, set as deck and return the card
      Object cardInstance[] = Main.deck[card];
      Object temparray[] = new Object[Main.deck.length - 1];
      System.arraycopy(Main.deck, 0, temparray, 0, card - 1);
      System.arraycopy(Main.deck, card + 1, temparray, card, Main.deck.length - card - 1);
      return cardInstance;
    }

  
    public static void main(String[] args){
      Main.shuffle();
      Hand phand = new Hand(deckPop((int)(Math.random() * Main.deck.length)), deckPop((int)(Math.random() * Main.deck.length)));
      System.out.println(phand.value());
      for (int x = 0; x < phand.length(); x++){
        System.out.println(phand.names()[x]);  
      }
    }
  }