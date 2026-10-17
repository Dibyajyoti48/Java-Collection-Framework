package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//11.Find the maximum element in an ArrayList.
public class Arr11maxEle {
  public static void main(String[] args) {
//	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
//	int max = list.get(0);
//	for(int i=0;i<list.size();i++) {
//		if(list.get(i)>max) {
//			max=list.get(i);
//		}
//	}
//	System.out.println(max);//50
	// Another approch 
	  ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
	   int max =Collections.max(list);
	  System.out.println(max);//50
}
}


