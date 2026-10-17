package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;
//Q20.Remove duplicate elements from an ArrayList.
public class Arr20removeDuplicate {
 public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 10, 30, 20, 40));
	for(int i=0;i<list.size();i++) {
	for(int j = i+1;j<list.size();j++) {
		if(list.get(i).equals(list.get(j))) {
			list.remove(j);
		}
	}	
	}
	System.out.println(list);
}
}
