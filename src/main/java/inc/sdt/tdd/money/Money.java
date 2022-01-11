package inc.sdt.tdd.money;

/**
 * @author hyoseok.choi (hyoseok.choi@sdt.inc)
 **/
class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
