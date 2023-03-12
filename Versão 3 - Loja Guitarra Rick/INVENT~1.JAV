package org.lojaguitarrasrick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, int numStrings, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, numStrings, backWood, topWood);
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

    public List<Guitar> search(GuitarSpec searchSpec){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            if(searchSpec.matches(guitar.getSpec())){
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}