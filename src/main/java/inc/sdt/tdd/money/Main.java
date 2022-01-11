package inc.sdt.tdd.money;

import java.lang.reflect.Modifier;

/**
 * @author hyoseok.choi (hyoseok.choi@sdt.inc)
 **/
public class Main {
    public static void main(String[] args) {
        MoneyTest moneyTest = new MoneyTest();
        moneyTest.testMultiplication();
        moneyTest.testEquality();
    }
}
