package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;

//32. Find elements present in one list but not another
public class Arr32 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(20,40,50));
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int num:list1) {
			if(!list2.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result );//  [10, 30]

	
	}

}
