public class Hand{
  
  private Object handArray[][];
  
  public Hand(Object[] c1, Object[] c2){
    this.handArray = new Object[][]{c1, c2};
  }

  public void append(Object[] card){
    System.arraycopy(card, 0, this.handArray, this.handArray.length, 1);
  }


  public int length(){
    return handArray.length;
  }

  
  public int value(){
    int count = 0;
    for (int i = 0; i < this.handArray.length; i++){
      count += ((int) this.handArray[i][0]);
    
    }
    return count;
  } 

  public String[] names(){
    String[] namesOut = new String[this.handArray.length];
    for (int c = 0; c < this.handArray.length; c++){
      namesOut[c] = (String)(this.handArray[c][2]) + " of " + (String)(this.handArray[c][1]) + "s";
      
    }
    return namesOut;
  }
}