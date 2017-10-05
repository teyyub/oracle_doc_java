package com.iktex.model;

/**
 *
 * @author teyyub Oct 4, 2017 8:44:41 AM
 */
public class Bicycle {

    //fields
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle() {
    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public int getCadence() {
        return cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printStates() {
        System.out.println("cadence:"
                + cadence + " speed:"
                + speed + " gear:" + gear);
    }
}
