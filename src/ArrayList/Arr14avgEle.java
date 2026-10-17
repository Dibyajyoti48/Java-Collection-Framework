package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//14.Calculate the average of all elements.
public class Arr14avgEle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,10,10,10,10));
		int sum = 0;
		int n = list.size();
		for(int i =0;i<list.size();i++) {
			sum = sum+list.get(i);
		}
		int avg = sum /n;
		System.out.println(n);//5
		System.out.println(avg);//10
	}

}
