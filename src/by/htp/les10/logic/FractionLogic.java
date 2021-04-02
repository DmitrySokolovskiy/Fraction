package by.htp.les10.logic;

import by.htp.les10.entity.Fraction;

public class FractionLogic {

    public Fraction sum(Fraction f1, Fraction f2) {
        int newNum;
        int newDen;

        newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getDenominator();
        newDen = f1.getDenominator() * f2.getDenominator();

        Fraction rezult = new Fraction(newNum, newDen);

        return rezult;
    }

    public Fraction reduce(Fraction f1) {
        int nod;
        Fraction result = new Fraction();

        if (f1.getNumerator() > f1.getDenominator()) {
            nod = f1.getDenominator();
        } else {
            nod = f1.getNumerator();
        }

        while (!((f1.getNumerator() % nod == 0) && (f1.getDenominator() % nod == 0))) {
            nod--;
        }

        result.setDenominator(f1.getDenominator() / nod);
        result.setNumerator(f1.getNumerator() / nod);

        return result;
    }

    public Fraction multiply(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();

        result.setNumerator(f1.getNumerator() * f2.getNumerator());
        result.setDenominator(f1.getNumerator() * f2.getNumerator());

        return result;
    }

    public Fraction division(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();

        result.setNumerator(f1.getNumerator() * f2.getDenominator());
        result.setDenominator(f1.getDenominator() * f2.getNumerator());

        return result;
    }
}
