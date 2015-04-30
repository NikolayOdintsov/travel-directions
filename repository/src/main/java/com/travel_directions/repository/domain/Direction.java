package com.travel_directions.repository.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nickodintsov on 4/27/15.
 */

@Entity
@Table(name = "Direction")
public class Direction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private long number;
    @Column(name = "airportCode")
    private String code;
    @Column
    private String airportName;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
