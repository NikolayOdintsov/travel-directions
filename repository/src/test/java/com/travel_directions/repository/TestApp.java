package com.travel_directions.repository;

import com.travel_directions.repository.dao.DirectionsDaoImpl;
import com.travel_directions.repository.domain.Direction;
import com.travel_directions.shared_api.request.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by nickodintsov on 4/30/15.
 */
public class TestApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DirectionsDaoImpl directionsDao = (DirectionsDaoImpl) context.getBean("directionsDaoImpl");
        List<Direction> list = directionsDao.getAll(null, Order.ASC);

        for(Direction p : list){
            System.out.println("Direction List::"+p.getAirportName());
        }

    }
}
