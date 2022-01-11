package inc.sdt.tdd.money;

/**
 * @author hyoseok.choi (hyoseok.choi@sdt.inc)
 **/
class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
