package com.travel_directions.repository.dao;


import com.travel_directions.repository.domain.Direction;
import com.travel_directions.shared_api.request.Order;

import java.util.List;

/**
 * Created by nickodintsov on 4/23/15.
 */

public interface IDirectionsDao {
    Long create(Direction t);
    Direction get(Long id);
    void update(Direction t);
    void delete(Direction t);
    List<Direction> getAll(String orderFieldName, Order order);
}
