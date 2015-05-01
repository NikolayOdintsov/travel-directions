package com.travel_directions.repository.dao;

import com.travel_directions.repository.domain.Direction;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by nickodintsov on 4/27/15.
 */


@Repository
@Transactional
public class DirectionsDaoImpl implements IDirectionsDao {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;


    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public Long create(Direction t) {
        return null;
    }

    @Override
    public Direction get(Long id) {
        return null;
    }

    @Override
    public void update(Direction t) {

    }

    @Override
    public void delete(Direction t) {

    }

    @Override
    public List<Direction> getAll(String orderFieldName, com.travel_directions.shared_api.request.Order order) {
        System.out.println("dataSource is " + dataSource);
        System.out.println("sessionFactory is " + sessionFactory);

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Direction.class);
        if (order != null) {
            if (order.equals(com.travel_directions.shared_api.request.Order.ASC)) {
                criteria.addOrder(Order.asc(getOrderFieldName(orderFieldName)));
            } else {
                criteria.addOrder(Order.desc(getOrderFieldName(orderFieldName)));
            }
        }
        List<Direction> directions = criteria.list();

//        for (Direction direction : directions) {
//            System.out.println("direction is " + direction.getAirportName());
//        }

        return directions;
    }

    private String getOrderFieldName(String orderFieldName) {
        if (orderFieldName != null && !orderFieldName.trim().isEmpty()) {
            return orderFieldName;
        } else {
            return "number";
        }
    }

}
