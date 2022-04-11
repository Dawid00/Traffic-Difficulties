package com.depe.roaddifficulties.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;


@Data
@ToString
@Builder
public class TrafficDifficulty {

    private String difficultyType;
    private String road;
    private String voivodeship;
    private double km;
    private double dl;
    private Location location;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime finishDate;
    private String roundAbout;
    private Type type;
    private String effects;
    private String liftingCapacityLimit;
    private String pressureCapacityLimit;
    private double widthLimit;
    private int speedLimit;
    private boolean alternatingTraffic;
    private boolean trafficLights;
    private boolean bridgeFailure;
    private boolean twoWay;
    private boolean closedRoad;
    private Latency latency;
    private String  horizontalExtremeLimit;
    private String verticalExtremeLimit;

}


