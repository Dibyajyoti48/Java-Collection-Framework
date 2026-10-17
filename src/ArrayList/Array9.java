package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

// Q9.iterate throughout a arraylist using for loop
public class Array9 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//10
//			20
//			30
//			40
//			50

		}
	}

}
