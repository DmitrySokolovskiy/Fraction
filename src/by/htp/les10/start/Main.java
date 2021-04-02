package by.htp.les10.start;

import by.htp.les10.entity.Fraction;
import by.htp.les10.logic.FractionLogic;
import by.htp.les10.presentation.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		Fraction f3;
		
		FractionLogic logic = new FractionLogic();
		
		f3 = logic.sum(f1, f2);
		
		FractionView view = new FractionView();
		
		view.printSum(f3);

		view.printReduce(logic.reduce(f1));
		view.printReduce(logic.reduce(f2));
		view.printReduce(logic.reduce(f3));

	}

}
