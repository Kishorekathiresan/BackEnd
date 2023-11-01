package kkk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class listaverage {

	public static void main(String[] args) {
		List<Integer> aa=new ArrayList<Integer>();
		aa.add(1);
		aa.add(3);
		aa.add(5);
		aa.add(7);
		aa.add(9);
		double avgvalue=aa.stream()
                .mapToDouble(Integer::doubleValue)
                .average().getAsDouble();
		System.out.println(avgvalue);
		
		

	}

}
