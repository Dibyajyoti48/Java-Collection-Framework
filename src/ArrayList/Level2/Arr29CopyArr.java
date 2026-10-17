package ArrayList.Level2;

import java.util.ArrayList;
import java.util.Arrays;

//29. copy an arraylist into another
public class Arr29CopyArr {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println("Original:"+list);//Original:[10, 20, 30, 40]
		System.out.println("Copy : "+list2);//Copy : [10, 20, 30, 40]
	}
 
}
