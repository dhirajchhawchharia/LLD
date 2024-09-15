import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Auction {

    List<Colleague> colleagues;
    String auctionName;
    int lastBid;

    public AuctionMediator(String auctionName) {
        this.auctionName = auctionName;
        this.colleagues = new ArrayList<>();
    }

    public void addColleagues(Colleague colleageue) {
        colleagues.add(colleageue);
    }

    @Override
    public void sendNotificationForBid(Colleague colleague, int amount) {
        for(Colleague coll : colleagues) {
            if(!colleague.getName().equalsIgnoreCase(coll.getName())) {
                coll.receiveNotificationForBid(amount);
            }
        }
        this.lastBid = amount;
    }
}
