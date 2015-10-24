
public class CaffeineBuzz {
 public static String caffeineBuzz(int n){
   System.out.println(n);
    if((n%4==0) && (n%3==0)){
     if(n%2==0){
       return "CoffeeScript";
     } else {
      return "Coffee";
     }
   }

   if(n%3==0){
     if(n%2==0){
       return "JavaScript";
     } else {
     return "Java";
     }
   }
   else {
     return "mocha_missing!";
   }
 }
}
