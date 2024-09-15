package WeightMachine;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl();
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
