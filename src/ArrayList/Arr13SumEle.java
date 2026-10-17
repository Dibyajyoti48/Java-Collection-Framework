package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//13.Calculate the sum of all elements.
public class Arr13SumEle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum+list.get(i);
		}
		System.out.println(sum);//150
	}

}
