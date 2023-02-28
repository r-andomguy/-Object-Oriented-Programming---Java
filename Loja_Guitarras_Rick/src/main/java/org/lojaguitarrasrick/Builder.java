package org.lojaguitarrasrick;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;

    public String toString() {
        return switch (this) {
            case FENDER -> "FENDER";
            case MARTIN -> "MARTIN";
            case GIBSON -> "GIBSON";
            case COLLINGS -> "COLLINGS";
            case OLSON -> "OLSON";
            case RYAN -> "RYAN";
            case PRS -> "PRS";
            case ANY -> "ANY";
        };
    }
}