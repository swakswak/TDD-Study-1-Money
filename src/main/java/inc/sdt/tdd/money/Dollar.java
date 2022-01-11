package inc.sdt.tdd.money;

import java.util.Objects;

/**
 * @author hyoseok.choi (hyoseok.choi@sdt.inc)
 **/
class Dollar extends Money{
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
