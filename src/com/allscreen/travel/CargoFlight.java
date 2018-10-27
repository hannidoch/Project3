package com.allscreen.travel ;


public class CargoFlight extends Flight {

    private int flightSize;

    public CargoFlight () {


    }
    public CargoFlight (int flightNumber, int flightSize) {

        super(flightNumber);
       this.flightSize =1000;
        System.out.println(super.getFlightNumber() +"  " +flightSize);


    }



}
