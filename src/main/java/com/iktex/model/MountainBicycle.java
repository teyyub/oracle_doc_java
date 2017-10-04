package com.iktex.model;

/**
 *
 * @author teyyub Oct 4, 2017 10:01:50 AM
 */
public class MountainBicycle extends Bicycle {

    public int seatHeight;

    public MountainBicycle(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public MountainBicycle() {
        super();

    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
