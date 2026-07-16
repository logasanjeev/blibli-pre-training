package banking;

public class Bank {
    protected final double baseTransactionCharge;

    public Bank(double baseTransactionCharge) {
        this.baseTransactionCharge = baseTransactionCharge;
    }

    public double calculateTransactionCharges(double transactionAmount) {
        return this.baseTransactionCharge;
    }

    public double getBaseTransactionCharge() {
        return this.baseTransactionCharge;
    }
}
