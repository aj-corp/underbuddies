package com.pack1;

public class InPatientVisit extends Visit{

    private int fromTime;
    private int toTime;

    public InPatientVisit(int fromTime, int toTime){
        super(1700,2000);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public boolean allowVisit(int visitingTime) {
        if(!super.allowVisit(visitingTime)){
            System.out.println("Out of regular visit hours");
            return false;
        }
        System.out.println("Allowed fo inPatient");
        return true;
    }
}
