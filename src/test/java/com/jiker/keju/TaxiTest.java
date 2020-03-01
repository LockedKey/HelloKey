package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxiTest {
    @Test
    public void test_distance_less_than_2(){
        Taxi taxi = new Taxi(1,0);
        assertEquals(6,taxi.getPrice());
    }
    @Test
    public void test_distance_between_2_and_8(){
        Taxi taxi = new Taxi(3,0);
        assertEquals(7,taxi.getPrice());
    }
    @Test
    public void test_distance_over_8(){
        Taxi taxi = new Taxi(10,0);
        assertEquals(13,taxi.getPrice());
    }
    @Test
    public void test_wait(){
        Taxi taxi = new Taxi(2,3);
        assertEquals(7,taxi.getPrice());
    }
    @Test
    public void test_getReceipt(){
        Taxi taxi = new Taxi(2,3);
        assertEquals("收费7元",taxi.getReceipt());
    }
}
