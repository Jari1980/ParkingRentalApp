package org.example.Counters;

public class ReservationCounter {
    private static int counter = 0;

    public static int getCounter(){
        return counter++;
    }
}
