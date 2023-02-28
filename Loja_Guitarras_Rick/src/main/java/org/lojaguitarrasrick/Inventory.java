package org.lojaguitarrasrick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            if (!searchSpec.getBuilder().equals(guitarSpec.getBuilder())) {
                continue;
            }

            String model = searchSpec.getModel().toLowerCase();
            if (!model.isEmpty() && !model.equals(guitarSpec.getModel().toLowerCase())) {
                continue;
            }
            if (!searchSpec.getType().equals(guitarSpec.getType())) {
                continue;
            }
            if (!searchSpec.getBackWood().equals(guitarSpec.getBackWood())) {
                continue;
            }
            if (!searchSpec.getTopWood().equals(guitarSpec.getTopWood())) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}