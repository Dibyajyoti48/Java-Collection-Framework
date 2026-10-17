package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Remove an element by index
public class Arr6Remove {
	
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
	list.remove(2);
	System.out.println(list);//[10, 20, 40]

}
}
