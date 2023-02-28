package org.lojaguitarrasrick;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guitar searchGuitar = new Guitar("V95693", 1499.95, Builder.builder.FENDER, "Stratocaster",
                Type.type.ELECTRIC, Wood.wood.ALDER, Wood.ALDER);

        Inventory inventory = new Inventory();
        inventory.addGuitar("123", 999.99, Builder.builder.FENDER, "Stratocaster",
                Type.type.ELECTRIC, Wood.wood.ALDER, Wood.MAPLE);
        inventory.addGuitar("456", 1499.99, Builder.builder.GIBSON, "Les Paul",
                Type.type.ELECTRIC, Wood.wood.MAHOGANY, Wood.MAPLE);
        inventory.addGuitar("789", 1999.99, Builder.builder.MARTIN, "D-28",
                Type.type.ACOUSTIC, Wood.wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK);


        List<Guitar> matchingGuitars = inventory.searchGuitar(searchGuitar);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Encontramos as seguintes guitarras que correspondem à busca:");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("  Número de série: " + guitar.getSerialNumber());
                System.out.println("  Preço: " + guitar.getPrice());
                System.out.println("  Builder: " + guitar.getBuilder());
                System.out.println("  Model: " + guitar.getModel());
                System.out.println("  Type: " + guitar.getType());
                System.out.println("  Back Wood: " + guitar.getBackWood());
                System.out.println("  Top Wood: " + guitar.getTopWood());
                System.out.println();
            }
        } else {
            System.out.println("Não foi encontrada nenhuma guitarra que corresponde à busca.");
        }
    }
}
