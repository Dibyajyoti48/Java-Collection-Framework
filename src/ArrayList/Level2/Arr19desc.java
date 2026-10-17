package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//19.Sort an ArrayList in descending order.
public class Arr19desc {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(40, 10, 50, 20, 30));
	// we can't write Collections.reverseOrder(list) because it did not accept any list
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);//[50, 40, 30, 20, 10]

	}

}
