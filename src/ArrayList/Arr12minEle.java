package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q.12 Find the minimum element in an ArrayList.
public class Arr12minEle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,67,89));
		 int min = Collections.min(list);
		 System.out.println(min);//10

	}
	

}
