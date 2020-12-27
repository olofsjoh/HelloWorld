package com.jool.vehicle;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum CarEnum implements Vehicle {
    VOLVO("Volvo"),
    SAAB("Saab"),
    FORD("Ford");

    private String name;
    private int id;

    private static final Map<String, CarEnum> ENUM_MAP;

    CarEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<String, CarEnum> map = new ConcurrentHashMap<String, CarEnum>();
        for (CarEnum instance : CarEnum.values()) {
            map.put(instance.getName(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static CarEnum get (String name) {
        return ENUM_MAP.get(name);
    }

    @Override
    public String toString() {
        return String.format("id:" + id + " type:" + getName());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int idIn) {
        id = idIn;
    }
}
