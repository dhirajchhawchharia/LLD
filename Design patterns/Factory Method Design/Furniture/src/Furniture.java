interface FurnitureItem {
    public void display();
}

class Sofa implements FurnitureItem {
    @Override
    public void display() {
        System.out.println("This is Sofa getting displayed");
    }
}

class Chair implements FurnitureItem {
    @Override
    public void display() {
        System.out.println("This is Chair getting displayed");
    }
}

class Table implements FurnitureItem {
    @Override
    public void display() {
        System.out.println("This is Table getting displayed");
    }
}

interface FurnitureFactory {
    public FurnitureItem createFurniture();
}

class SofaFurnitureFactory implements FurnitureFactory {
    @Override
    public FurnitureItem createFurniture() {
        return new Sofa();
    }
}

class ChairFurnitureFactory implements FurnitureFactory {
    @Override
    public FurnitureItem createFurniture() {
        return new Chair();
    }
}

class TableFurnitureFactory implements FurnitureFactory {
    @Override
    public FurnitureItem createFurniture() {
        return new Table();
    }
}

public class Furniture {
    public static void main(String[] args) {
        FurnitureFactory factory = new TableFurnitureFactory();
        FurnitureItem furnitureItem = factory.createFurniture();
        furnitureItem.display();
    }
}
