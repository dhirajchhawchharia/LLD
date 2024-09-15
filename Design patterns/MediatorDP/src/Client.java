public class Client {
    public static void main(String[] args) {
        Auction auctionGame = new AuctionMediator("Game of games");

        Colleague bidder1 = new Bidder("Abhishek", auctionGame);
        Colleague bidder2 = new Bidder("Arvind", auctionGame);
        Colleague bidder3 = new Bidder("Dhiraj", auctionGame);

        bidder1.placeBids(1000);
        bidder2.placeBids(2000);
        bidder3.placeBids(3000);
        bidder1.placeBids(3005);
        
    }
}
