package com.travel_directions.shared_api.request;

/**
 * Created by nickodintsov on 4/19/15.
 */
public enum Order {
    ASC("asc"), DESC("desc");
    private final String name;

    Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
