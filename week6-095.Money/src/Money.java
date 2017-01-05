public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int sumEuros;
        int sumCents;

        Money plus = new Money(euros, cents);

        sumEuros = added.euros + plus.euros;
        sumCents = added.cents + plus.cents;

        Money addEuros = new Money(sumEuros, sumCents);

        return addEuros;
    }

    public boolean less(Money compared) {
        Money money = new Money(euros, cents);
        if (compared.euros > money.euros) {
            return true;
        } else if (compared.euros == money.euros) {
            if (compared.cents > money.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decremented) {
        int minusEuros;
        int minusCents = 0;


        Money minus = new Money(euros, cents);

        if (less(decremented)) {
            minusEuros = (minus.euros - decremented.euros);
            if (minusEuros < 0) {
                minusEuros = 0;
            }

        } else {
            minusEuros = (minus.euros - decremented.euros);

            if (minus.cents == 0 && decremented.cents > 0){
                minusCents = 100 - decremented.cents;
                minusEuros--;
            }
                else if (decremented.cents == 0 && minus.cents > 0){
                minusCents = 100 - minusCents;
            }
        }

        Money minusEuro = new Money(minusEuros, minusCents);

        return minusEuro;
    }


}
