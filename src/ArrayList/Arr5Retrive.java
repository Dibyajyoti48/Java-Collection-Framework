package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//Retrieve an element using its index
public class Arr5Retrive {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
	System.out.println(list.get(2));
	
}
}
