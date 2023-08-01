package com.pack1;

public class VIPVisit extends Visit{

    private int fromTime;
    private int toTime;

    public VIPVisit(int fromTime, int toTime){
        super(1700,2000);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public boolean allowVisit(int visitingTime) {
        if(!super.allowVisit(visitingTime)){
            System.out.println("Out of regular visit hours");
            return false;
        } else if(!(super.fromTime >= this.fromTime && super.toTime <= this.toTime)){
            System.out.println("You are allowed even in regular visiting hours because visting time is not in between for VIP timings");
            return  false;
        }
        return true;
    }
}
