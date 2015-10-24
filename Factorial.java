public class Factorial {

  public int factorial(int n) {
    System.out.println(n);
    int result=1;
    if((n > 12) || (n<0)){
      throw new IllegalArgumentException();
    }
    for(int i=n; i>0; i--){
      if(n==0){
        result=result;
      }
      result += result*(i-1);
    }
    return result;
  }
}
