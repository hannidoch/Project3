package com.allscreen.travel ;



import java.util.Objects;

public class Flight {

    Object xyz = new Object();
    private double[] numbers = new double[100];
    private int flightNumber;
    private String airline = new String();

    {

        for (int i = 0; i<100; i++)


        {
            if (i == 0) {

                numbers[i] = 1.0;
            } else {
                numbers[i] = numbers[i - 1] + 1.0;
            }
        }

    }

    public Flight() {

        this.flightNumber = 123;
        this.airline = "emirates";

    }

    public Flight(int flightNumber) {

        this.flightNumber = flightNumber;


    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline='" + airline + '\'' +
                '}';
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double[] getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber &&
                Objects.equals(airline, flight.airline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightNumber, airline);
    }
}
