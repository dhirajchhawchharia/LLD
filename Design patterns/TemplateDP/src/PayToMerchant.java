public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validating merchant's pay request");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for pay to merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting amount for pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting amount to merchant's account");
    }

}
