package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;

//31.Find common elements between two ArrayLists

public class Arr31Commonele {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(20,40,50,60));
		ArrayList<Integer> common = new ArrayList<Integer>();
		for (int num :list1) {
			if(list2.contains(num) && !common.contains(num)){
				common.add(num);
			}
		}
		System.out.println("Common elements are :"+common);//Common elements are :[20, 40]

	}

}
