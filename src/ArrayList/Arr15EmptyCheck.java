package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//15.Check whether an ArrayList is empty.
public class Arr15EmptyCheck {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());
		if(list.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
		  System.out.println("list is not empty");
		}
		
	}

}
