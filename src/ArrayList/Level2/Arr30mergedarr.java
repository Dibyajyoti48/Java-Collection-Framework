package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;

//30. Merge two ArrayLists
//Logic: addAll() appends all elements from the second list to the first list's copy.
public class Arr30mergedarr {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		ArrayList<Integer> list2 = new ArrayList<Integer>( Arrays.asList(60,45));
		 list1.addAll(list2);
		 System.out.println(list1);//[10, 20, 30, 40, 50, 60, 45]
		
	}

}
