package tdd.bonus;

public class BonusCalculator {

    public Integer calculate(int sales, int quota, int commission, int tax) {
        int bonus;
        if (sales <= quota) {
            return 0;
        }
        bonus = sales - quota;
        bonus = withCommission(commission, bonus);
        return taxed(tax, bonus);
    }

    private int taxed(int tax, int value) {
        return value - value * tax / 100;
    }

    private int withCommission(int commission, int value) {
        return value * commission / 100;
    }
}
