public class SquareDigit {

  public int squareDigits(int n) {
    String numbers = Integer.toString(n);
    int len = numbers.length();
    StringBuilder result = new StringBuilder(len);
    for(int i=0; i<len; i++){
       char letter = numbers.charAt(i);
       int num =  Character.getNumericValue(letter);
       int square = num*num;
       String total = Integer.toString(square);
       result.append(total);
    }
    String endResult = result.toString();
    return Integer.parseInt(endResult);
  }

}
