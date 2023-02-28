package org.lojaguitarrasrick;
public class Guitar {
    private String serialNumber;
    private double price;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getBuilder() {
        return null;
    }
}
