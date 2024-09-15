public class Bidder implements Colleague {
    String name;
    Auction auctionMediator;
    int bidAmount;

    public Bidder(String name, Auction auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addColleagues(this);
    }

    @Override
    public void placeBids(int amount) {
        auctionMediator.sendNotificationForBid(this, amount);
    }

    @Override
    public void receiveNotificationForBid(int amount) {
        System.out.println("Notification to " + this.name + " Bid placed for amount: " + amount);
    }

    public String getName() {
        return this.name;
    }
}
