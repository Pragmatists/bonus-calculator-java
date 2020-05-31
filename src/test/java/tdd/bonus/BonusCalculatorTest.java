package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonusCalculatorTest {

    @Test
    public void no_bonus_when_sales_less_than_quota() {
        Integer bonus = new BonusCalculator().calculate(90, 100, 10, 0);

        assertThat(bonus).isEqualTo(0);
    }

    @Test
    public void no_bonus_when_sales_equal_quota() {
        Integer bonus = new BonusCalculator().calculate(100, 100, 100, 0);

        assertThat(bonus).isEqualTo(0);
    }

    @Test
    public void bonus_is_given_when_sales_grater_that_quota() {
        Integer bonus = new BonusCalculator().calculate(1000, 900, 100, 0);

        assertThat(bonus).isEqualTo(100);
    }

    @Test
    public void bonus_value_depend_on_commission() {
        Integer bonus = new BonusCalculator().calculate(1000, 900, 10, 0);

        assertThat(bonus).isEqualTo(10);
    }

    @Test
    public void bonus_value_depend_on_tax() {
        Integer bonus = new BonusCalculator().calculate(1000, 900, 10, 10);

        assertThat(bonus).isEqualTo(9);
    }


}
