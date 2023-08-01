package com.pack1;

public class ICUVisit extends Visit{
    private int fromTime;
    private int toTime;

    public ICUVisit(int fromTime, int toTime){
        super(1700,2000);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public boolean allowVisit(int visitingTime) {
        if(!super.allowVisit(visitingTime)){
            System.out.println("Out of regular visit hours");
            return false;
        } else if(!(super.fromTime >= this.fromTime && super.toTime <= this.toTime)){
            System.out.println("You are not allowed even in regular visiting hours because visting time is not in between for ICU timings");
            return  false;
        }
        return true;
    }
}
