public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i ++)
    {
      char x = str.charAt(i);
      if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
      {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }


}
