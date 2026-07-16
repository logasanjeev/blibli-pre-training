package banking;

public class HDFC extends Bank{
    private static final double HDFC_FLAT_SURCHARGE = 15.00D;

    public HDFC(double baseTransactionCharge) {
        super(baseTransactionCharge);
    }

    @Override
    public double calculateTransactionCharges(double transactionAmount) {
        return this.baseTransactionCharge + HDFC_FLAT_SURCHARGE;
    }
}
