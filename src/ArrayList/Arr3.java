package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arr3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
		Collections.reverse(list);
		System.out.println(list);//[40, 30, 20, 10]

	}

}
