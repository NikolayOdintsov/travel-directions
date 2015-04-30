package com.travel_directions.shared_api.response;


import com.travel_directions.shared_api.dto.DirectionDTO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by nickodintsov on 4/19/15.
 */

@XmlType(namespace = "com.travel_directions.shared.response",
        name = "GetAllDirectionsResponse")
@XmlRootElement(name = "GetAllDirectionsResponse")
public class GetAllDirectionsResponse extends ResponseBase {
    private List<DirectionDTO> directionList;

    @XmlElementWrapper(name = "directionList")
    @XmlElement(name = "directionList")
    public List<DirectionDTO> getDirectionList() {
        return directionList;
    }

    public void setDirectionList(List<DirectionDTO> directionList) {
        this.directionList = directionList;
    }
}
