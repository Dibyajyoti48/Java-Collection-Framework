package ArrayList;

import java.util.ArrayList;

//q1.Print all elements
public class Arr1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		for(int x: list) {
			System.out.println(x);//10
			//20
			//30
			//40

		}		
		
	}
}
