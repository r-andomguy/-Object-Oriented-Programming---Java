package org.lojaguitarrasrick;

import java.util.*;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> searchGuitar(String model, String type, String backWood, String topWood) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (!isEmptyOrNull(model) && !guitar.getModel().equals(model)) {
                continue;
            }
            if (!isEmptyOrNull(type) && !guitar.getType().equals(type)) {
                continue;
            }
            if (!isEmptyOrNull(backWood) && !guitar.getBackWood().equals(backWood)) {
                continue;
            }
            if (!isEmptyOrNull(topWood) && !guitar.getTopWood().equals(topWood)) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    private boolean isEmptyOrNull(String s) {
        return s == null || s.isEmpty();
    }
}
