package com.company;

public abstract class Car {
    private Wheel wheel;
    private SteeringWheel steeringWheel;
    private String name;


    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(Wheel wheel, SteeringWheel steeringWheel, String name){
        this.wheel = wheel;
        this.steeringWheel = steeringWheel;
        this.name = name;

    }


}
