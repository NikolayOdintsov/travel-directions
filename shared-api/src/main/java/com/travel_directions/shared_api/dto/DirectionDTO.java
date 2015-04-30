package com.travel_directions.shared_api.dto;

import java.io.Serializable;

/**
 * Created by nickodintsov on 4/27/15.
 */
public class DirectionDTO implements Serializable {
    private String code;
    private String fullName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
