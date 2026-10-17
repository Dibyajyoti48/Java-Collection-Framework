package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//35.Remove all null elements from an ArrayList
public class Arr35nullremove {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,null,20,null,30));
		for(int i = list1.size()-1;i>=0;i--) {
			if(list1.get(i)== null) {
				list1.remove(i);
			}
		}
		System.out.println(list1);//[10, 20, 30]

	}

}
