
// Receiver
class RideService {
    public void requestRide(String passenger) {
        System.out.println("Ride requested for passenger:  " + passenger);
    }

    public void cancelRide(String passenger) {
        System.out.println("Canceled ride for passenger: " + passenger);
    }
}

interface ICommand {
    public void execute();
}

class RideRequestCommand implements ICommand {
    private RideService receiver;
    private String passenger;
    private String fromLocation;
    private String toLocation;

    public RideRequestCommand(RideService receiver, String passenger, String fromString, String toLocation) {
        this.receiver = receiver;
        this.passenger = passenger;
        this.fromLocation = fromString;
        this.toLocation = toLocation;
    }

    @Override
    public void execute() {
        receiver.requestRide(passenger);
    }
}

class RideCancelCommand implements ICommand {
    private RideService receiver;
    private String passenger;

    public RideCancelCommand(RideService receiver, String passenger) {
        this.receiver = receiver;
        this.passenger = passenger;
    }

    @Override
    public void execute() {
        receiver.cancelRide(passenger);
    }
}

class RideRequestInvoker {
    public void processRequest(ICommand command) {
        command.execute();
    }
}

public class UberRides {
    public static void main(String[] args) {
        RideService receiver = new RideService();

        ICommand rideRequest1 = new RideRequestCommand(receiver, "a", "marathahalli", "bellandur");
        ICommand rideRequest2 = new RideRequestCommand(receiver, "b", "koramanagala", "jayanagar");
        ICommand cancelRide1 = new RideCancelCommand(receiver, "a");

        RideRequestInvoker rideRequestInvoker = new RideRequestInvoker();

        rideRequestInvoker.processRequest(rideRequest1);
        rideRequestInvoker.processRequest(rideRequest2);
        rideRequestInvoker.processRequest(cancelRide1);
    }
}
