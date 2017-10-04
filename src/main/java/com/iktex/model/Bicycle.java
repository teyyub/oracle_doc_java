 

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

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

   public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}