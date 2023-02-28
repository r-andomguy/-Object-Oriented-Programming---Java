package org.lojaguitarrasrick;

public class Type {
    public enum type {
        ACOUSTIC, ELECTRIC;
        public String fromString(String type) {
            switch (this) {
                case ACOUSTIC:
                    return "ACOUSTIC";
                case ELECTRIC:
                    return "ELECTRIC";
                default:
                    throw new IllegalArgumentException("Invalid type: " + type);
            }
        }
    }
}
