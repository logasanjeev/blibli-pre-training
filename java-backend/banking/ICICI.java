package banking;

public class ICICI extends Bank{
    private static final double ICICI_SURCHARGE_PERCENT = 0.5D / 100;

    public ICICI(double baseTransactionCharge) {
        super(baseTransactionCharge);
    }

    @Override
    public double calculateTransactionCharges(double transactionAmount) {
        double dynamicCharge = transactionAmount * ICICI_SURCHARGE_PERCENT;
        return this.baseTransactionCharge + dynamicCharge;
    }
}
