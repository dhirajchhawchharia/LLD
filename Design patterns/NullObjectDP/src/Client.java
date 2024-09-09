public class Client {
    public static void main(String[] args) {
        Vehicle v = new NullVehicle();
        System.out.println(v.getSeatingCapacity());
        System.out.println(v.getTankCapacity());
    }
}