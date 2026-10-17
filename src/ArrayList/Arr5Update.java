package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Update an element at a given index
public class Arr5Update {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		list.set(1, 44);
		System.out.println(list);//[10, 44, 30, 40]
	}

}
