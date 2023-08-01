package com.pack1;

import lombok.Data;


public abstract class Visit {

    protected int fromTime;
    protected int toTime;

    public Visit(int fromTime, int toTime){
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public boolean allowVisit(int visitingTime) {
        return fromTime < visitingTime && toTime > visitingTime;
    }
}
