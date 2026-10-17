package ArrayList;
import java.util.*;
public class Arr2 {
	//Find the largest element
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList(Arrays.asList(10,50,20,80,30));
		int max = list.get(0);
		for(int x:list) {
			if(x>max) {
				max = x;
			}
		}
		System.out.println(max);//80
	}
}


