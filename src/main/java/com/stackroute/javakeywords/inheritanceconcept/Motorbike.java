package com.stackroute.javakeywords.inheritanceconcept;

public class Motorbike {

    // the Motorbike class has two fields
    public int gear;
    public int speed;

    // the Motorbike class has one constructor
    public Motorbike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Motorbike class has two methods
    public void applyBrake(int decrement)
    {
        speed = speed-decrement;
    }

    public void speedUp(int increment)
    {
        speed = speed+increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
    }
}
