package com.travel_directions.shared_api.request;

/**
 * Created by nickodintsov on 4/19/15.
 */
public class GetAllDirectionsRequest extends RequestBase {
    private Order order;
    private OrderField orderField;

    public static enum OrderField {
        NUMBER("number"), AIRPORT_CODE("airportCode"), AIRPORT_NAME("airportName");
        private final String name;

        OrderField(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderField getOrderField() {
        return orderField;
    }

    public void setOrderField(OrderField orderField) {
        this.orderField = orderField;
    }
}
