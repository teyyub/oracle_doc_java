 

package com.iktex.bicycle.intf;

/**
 *
 * @author teyyub Oct 4, 2017 8:52:26 AM
 */
   interface Bicycle {
//  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
 
}
