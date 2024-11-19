package org.example.Counters;

public class CustomerCounter {
    private static int counter = 0;

    public static int getCounter(){
        return counter++;
    }
}
