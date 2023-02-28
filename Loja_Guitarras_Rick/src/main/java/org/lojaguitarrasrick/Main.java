package org.lojaguitarrasrick;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec erinGuitar = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(erinGuitar);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("\nEncontramos as seguintes guitarras que correspondem à busca:");
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = guitar.getSpec();
                System.out.println("  Builder: " + spec.getBuilder());
                System.out.println("  Model: " + spec.getModel());
                System.out.println("  Type: " + spec.getType());
                System.out.println("  Back Wood: " + spec.getBackWood());
                System.out.println("  Top Wood: " + spec.getTopWood());
                System.out.println();
            }
        } else {
            System.out.println("Não foi encontrada nenhuma guitarra que corresponde à busca.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("456", 1499.99, Builder.GIBSON, "Les Paul",
                Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("789", 1999.99, Builder.MARTIN, "D-28",
                Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);
    }
}