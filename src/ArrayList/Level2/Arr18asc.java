package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//18.Sort an ArrayList in ascending order.
public class Arr18asc {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,4,5,67,89));
		Collections.sort(list);
		System.out.println(list);//[4, 5, 23, 67, 89]

	}

}
