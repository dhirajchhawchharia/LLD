public class PayToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validating friend's pay request");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting amount for pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting amount to friend");
    }

}
