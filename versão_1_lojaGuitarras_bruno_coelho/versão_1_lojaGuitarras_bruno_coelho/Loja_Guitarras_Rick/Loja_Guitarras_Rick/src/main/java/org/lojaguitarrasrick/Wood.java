package org.lojaguitarrasrick;

public class Wood {
public enum wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String fromString(String wood) {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            default:
                throw new IllegalArgumentException("Invalid wood: " + wood);
        }
    }
}
}
