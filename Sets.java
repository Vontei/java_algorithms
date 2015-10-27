public class Sets {

  private static final Set<String> COUNTRIES = HashSet<String>() {{
            add("DENMARK");
            add("SWEDEN");
            add("FINLAND");
        }}
    public static void main(String[] args){
    System.out.println(COUNTRIES);

  }
}
