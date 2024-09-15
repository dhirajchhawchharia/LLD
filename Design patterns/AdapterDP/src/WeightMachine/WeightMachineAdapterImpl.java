package WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    IWeightMachine weightMachine;

    public WeightMachineAdapterImpl() {
        weightMachine = new BabyWeightMachine();
    } 

    @Override
    public double getWeightInKgs() {
        int weightInPounds = weightMachine.getWeightInPounds();
        return weightInPounds*0.45;
    }

}
