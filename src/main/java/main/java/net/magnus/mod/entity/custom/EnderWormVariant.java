package main.java.net.magnus.mod.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum EnderWormVariant {
    DEFAULT(0),
    PURPLE(1);

    private static final EnderWormVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(EnderWormVariant::getId)).toArray(EnderWormVariant[]::new);
    private final int id;

    EnderWormVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static EnderWormVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}