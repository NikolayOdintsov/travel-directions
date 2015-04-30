package com.travel_directions.service;

import com.travel_directions.repository.dao.IDirectionsDao;
import com.travel_directions.repository.domain.Direction;
import com.travel_directions.shared_api.request.GetAllDirectionsRequest;
import com.travel_directions.shared_api.response.GetAllDirectionsResponse;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by nickodintsov on 4/19/15.
 */

@WebService(endpointInterface = "com.travel_directions.service.ITravelDirectionsService")
public class TravelDirectionsService implements ITravelDirectionsService {

    @Autowired
    @Qualifier("directionsRepository")
    public IDirectionsDao directionsDao;

    @Autowired
    @Qualifier("dozerMapper")
    private Mapper mapper;

    @Override
    public GetAllDirectionsResponse getAllDirections(GetAllDirectionsRequest request) {
        String orderFieldName = request.getOrderField() != null ? request.getOrderField().getName() : "";

//        System.out.println("directionsDao = "+directionsDao);
//        System.out.println("connectionTest = "+connectionTest);
//        connectionTest.call();


//        List<Direction> directionList = directionsDao.getAll(orderFieldName, request.getOrder());
//        List<DirectionDTO> directionDtoList = new ArrayList<DirectionDTO>();
//        for (Direction direction : directionList) {
//            DirectionDTO dto = mapper.map(direction, DirectionDTO.class);
//            directionDtoList.add(dto);
//        }

        System.out.println("directionsDao=" + directionsDao);
        List<Direction> directionList = directionsDao.getAll(orderFieldName, request.getOrder());
        GetAllDirectionsResponse response = new GetAllDirectionsResponse();
        response.setDirectionList(null);

        return response;
    }
}
