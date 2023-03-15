public class Main{
    
    static String[] suits = {"Diamond", "Heart", "Spade", "Club"};
    static Object[][] values = { {"One", 1},{"Two", 2},{"Three", 3},{"Four", 4},{"Five", 5},{"Six", 6},{"Seven", 7},{"Eight", 8},{"Nine", 9},{"Ten", 10},{"Jack", 10}, {"Queen", 10}, {"King", 10}, {"Ace", 11} };
    public static Object[] deck = new Object[56];
    
    static void shuffle(){
      int counter = 0;
      for (int i = 0; i < Main.suits.length; i++){
          for (int x=0; x < Main.values.length; x++){
              Object[][] cardInstance = {{Main.values[x][1], Main.suits[i], Main.values[x][0]}};
              System.arraycopy(cardInstance, 0, Main.deck, counter, cardInstance.length);
              counter++;
            }
        }
    }
  
    public static void main(String[] args){
      Main.shuffle();
    }
}