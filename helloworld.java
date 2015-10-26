
public class HelloWorld{

  public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println("Java + Atom = Fun");
  }

  public int getCount(String str) {
    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i ++){
      char x = str.charAt(i);
      if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
        vowelsCount++;
      }
    }
    System.out.println(vowelsCount);
    return vowelsCount;
  }


}

HelloWorld.getCount("NICHOLAS");
