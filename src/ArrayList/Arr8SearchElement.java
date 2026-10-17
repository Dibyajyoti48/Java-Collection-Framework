package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Search for an element in an ArrayList
public class Arr8SearchElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		//int search = 30;
		if(list.contains(30)) {
			System.out.println("Element found");
		}
		else {
			System.out.println(" Element not found");
		}	
	}
}
