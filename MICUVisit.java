package com.pack1;

public class MICUVisit extends Visit{
    private int fromTime;
    private int toTime;

    public MICUVisit(int fromTime, int toTime){
        super(1700,2000);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public boolean allowVisit(int visitingTime) {
        if(!super.allowVisit(visitingTime)){
            System.out.println("Out of regular visit hours");
            return false;
        } else if(!(super.fromTime >= this.fromTime && super.toTime <= this.toTime)){
            System.out.println("You are allowed even in regular visiting hours because visting time is not in between for MICU timings");
            return  false;
        }
        return true;
    }
}
