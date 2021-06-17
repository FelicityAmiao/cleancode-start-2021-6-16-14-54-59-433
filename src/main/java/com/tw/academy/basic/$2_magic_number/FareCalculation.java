package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {
    public final static int ORDINARY_EXPENSES_MAX = 150;
    public final static int ORDINARY_EXPENSES_MIN = 100;
    public final static int SPECIAL_EXPENSES_MAX = 400;
    public static final double ORDINARY_EXPENSES_DISCOUNT = 0.8;
    public static final double SPECIAL_EXPENSES_DISCOUNT = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= ORDINARY_EXPENSES_MIN && cumulativeExpensesThisMonth < ORDINARY_EXPENSES_MAX) {
            return originalPrice * ORDINARY_EXPENSES_DISCOUNT;
        }
        if (cumulativeExpensesThisMonth >= ORDINARY_EXPENSES_MAX && cumulativeExpensesThisMonth < SPECIAL_EXPENSES_MAX) {
            return originalPrice * SPECIAL_EXPENSES_DISCOUNT;
        }
        return originalPrice;
    }
}
