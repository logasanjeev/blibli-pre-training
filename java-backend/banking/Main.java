package banking;

public class Main {
    public static void main(String[] args) {
        double commonBaseCharge = 10.0D;
        double transactionAmount = 5000.0D;

        Bank genericBank = new Bank(commonBaseCharge);
        Bank iciciBank = new ICICI(commonBaseCharge);
        Bank hdfcBank = new HDFC(commonBaseCharge);

        System.out.println("Transaction Amount: Rs. " + Math.floor(transactionAmount * 100) / 100);
        System.out.println();

        System.out.println("Generic Bank Charges: Rs. " + Math.floor(genericBank.calculateTransactionCharges(transactionAmount) * 100) / 100);
        System.out.println("ICICI Bank Charges: Rs. " + Math.floor(iciciBank.calculateTransactionCharges(transactionAmount) * 100) / 100);
        System.out.println("HDFC Bank Charges: Rs. " + Math.floor(hdfcBank.calculateTransactionCharges(transactionAmount) * 100) / 100);
    }
}
