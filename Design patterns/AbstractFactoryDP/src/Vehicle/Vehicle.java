package Vehicle;

interface ICar {
    void setColor(String color);
}

class MarutiCar implements ICar {
    @Override
    public void setColor(String color) {
        System.out.println("This is Maruti Car with color: " + color);
    }
}

class HyundaiCar implements ICar {
    @Override
    public void setColor(String color) {
        System.out.println("This is Hyundai Car with color: " + color);
    }
}

class MGCar implements ICar {
    @Override
    public void setColor(String color) {
        System.out.println("This is MG Car with color: " + color);
    }
}

interface IBike {
    void setEngineCapacity(Integer capacity);
}

class MarutiBike implements IBike {
    @Override
    public void setEngineCapacity(Integer capacity) {
        System.out.println("This is Maruti Bike with capacity: " + capacity);
    }
}

class HyundaiBike implements IBike {
    @Override
    public void setEngineCapacity(Integer capacity) {
        System.out.println("This is Hyundai Bike with capacity: " + capacity);
    }
}

class MGBike implements IBike {
    @Override
    public void setEngineCapacity(Integer capacity) {
        System.out.println("This is MG Bike with capacity: " + capacity);
    }
}

interface IVehicleFactory {
    public ICar createCar();
    public IBike createBike();
}

class MarutiFactory implements IVehicleFactory {
    @Override
    public ICar createCar() {
        return new MarutiCar();
    }

    @Override
    public IBike createBike() {
        return new MarutiBike();
    }
}

class HyundaiFactory implements IVehicleFactory {
    @Override
    public ICar createCar() {
        return new HyundaiCar();
    }

    @Override
    public IBike createBike() {
        return new HyundaiBike();
    }
}

class MGFactory implements IVehicleFactory {
    @Override
    public ICar createCar() {
        return new MGCar();
    }

    @Override
    public IBike createBike() {
        return new MGBike();
    }
}

class MainFactory {
    public static IVehicleFactory createFactory(String company) {
        if(company.equalsIgnoreCase("maruti"))
            return new MarutiFactory();
        else if (company.equalsIgnoreCase("hyundai"))
            return new HyundaiFactory();
        else if(company.equalsIgnoreCase("mg"))
            return new MGFactory();
        return null;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        IVehicleFactory vehicleFactory = MainFactory.createFactory("maruti");
        ICar car = vehicleFactory.createCar();
        IBike bike = vehicleFactory.createBike();

        car.setColor("blue");
        bike.setEngineCapacity(200);
    }
}
