public class Client {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendMoney();
    }
}
