public class Reversal {

  public static void reverseIt(String str){
    int length = str.length();
    StringBuilder holder = new StringBuilder(length);
    for(int i = (length-1); i>=0; i--){
      holder.append(str.charAt(i));
    }
    System.out.println(holder.toString());
  }


  public static void main(String[] args){
      Reversal trial = new Reversal();
      trial.reverseIt("NICHOLAS");
  }

}
