package by.htp.les10.presentation;

import by.htp.les10.entity.Fraction;

public class FractionView {

    public void printSum(Fraction f) {
            System.out.println(f.getNumerator() + " :num & dem: " + f.getDenominator());
        }

    public void printReduce(Fraction f) {
        System.out.println(f.getNumerator() + " :num & dem: " + f.getDenominator());
    }

}
