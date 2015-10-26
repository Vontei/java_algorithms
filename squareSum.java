public class Kata {

  public static int alternateSqSum(int[] arr) {
  int accumulator = 0;
  if(arr.length==0){
    return 0;
  }
  for(int i=0; i<arr.length; i++){
    if(i% 2 == 0){
      accumulator += arr[i];
    } else {
      accumulator += (arr[i]*arr[i]);

      }
  }
    return accumulator;
  }
  
}
