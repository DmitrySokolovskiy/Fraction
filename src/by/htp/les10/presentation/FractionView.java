package by.htp.les10.presentation;

import by.htp.les10.entity.Fraction;

public class FractionView {

    public void printSum(Fraction f) {
        System.out.println("Сумма дробей равна: " + f.getNumerator() + "/" + f.getDenominator());
    }

    public void printReduce(Fraction f) {
        System.out.println("Приведение дробей равно: " + f.getNumerator() + "/" + f.getDenominator());
    }

    public void printMultiply(Fraction f) {
        System.out.println("Произведение дробей равно: " + f.getNumerator() + "/" + f.getDenominator());
    }

    public void printDivision(Fraction f) {
        System.out.println("Деление дробей равно: " + f.getNumerator() + "/" + f.getDenominator());
    }

}
