/**
 * Created by nickmattei on 1/15/16.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Sort Some Words for Kelly");
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();
        first.add("Zenith");
        first.add("Apple");
        first.add("Book");
        first.add("Gym");
        second.add("Stewie");
        second.add("Animal");
        second.add("Nancy");
        second.add("Phillip");     
        merge(first, second);
    }

  public static List<String> merge(List<String> first, List<String> second){
  	first.addAll(second);
  	System.out.println(first);
		for(int i=0; i<first.size()-1; i++){
			for(int j=0; j<first.size()-1; j++){

				if((first.get(j+1).compareTo(first.get(j))) >= 0 && (first.get(j+1) != null)){
  			}

    			else if((first.get(j+1) == null) && (first.get(j).compareTo(first.get(j-1)) >= 0)){
  				String holder = first.get(j);
  				first.set(j, first.get(j-1));
  				first.set(j-1, holder);
  			}
  			else{
  				String holder = first.get(j);
  				first.set(j, first.get(j+1));
  				first.set(j+1, holder);
  			}
			}
		}
  	System.out.println(first);
  	return first;
  }
}
