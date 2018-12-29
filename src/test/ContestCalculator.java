package test;

import java.util.ArrayList;

public class ContestCalculator {
	public ArrayList<Double> calculateWinner(ArrayList<Double> x, ArrayList<Double> y) {
		int temp = 0;
		for (int i = 0; i < x.size(); i++) {
			temp+=x.get(i);
		}
		int temp2 =0;
		for (int i = 0; i < y.size(); i++) {
			temp+=y.get(i);
		}
		if(temp>temp2) {
			return x;
		}else {
			return y;
		}
	}
}
