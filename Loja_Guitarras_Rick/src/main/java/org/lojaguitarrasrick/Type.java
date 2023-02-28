package org.lojaguitarrasrick;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "ACOUSTIC";
            case ELECTRIC -> "ELECTRIC";
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}