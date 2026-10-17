package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//16.Reverse an ArrayList using Collections.reverse().
public class Arr16Rev {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		Collections.reverse(list);
		System.out.println(list);//[50, 40, 30, 20, 10]
	
		}
}
