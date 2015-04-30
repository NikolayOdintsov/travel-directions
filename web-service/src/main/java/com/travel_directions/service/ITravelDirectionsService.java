package com.travel_directions.service;


import com.travel_directions.shared_api.request.GetAllDirectionsRequest;
import com.travel_directions.shared_api.response.GetAllDirectionsResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by nickodintsov on 4/19/15.
 */

@WebService
public interface ITravelDirectionsService {

    @WebMethod
    public GetAllDirectionsResponse getAllDirections(GetAllDirectionsRequest request);
}
