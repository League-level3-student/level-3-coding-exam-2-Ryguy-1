package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public ArrayList<String> commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		ArrayList<String> strings = new ArrayList<String>();

			for (int j = 0; j < lst.size(); j++) {
				int x = lst.get(j);
			if(hm.containsKey(x)){
				strings.add(hm.get(x));
			}
		}
		return strings;
	}

}
