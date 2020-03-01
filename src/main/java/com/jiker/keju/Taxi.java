package com.jiker.keju;

public class Taxi {
    private final int distance;
    private final int wait;

    public Taxi(int distance, int wait) {

        this.distance = distance;
        this.wait = wait;
    }

    public int getPrice() {
        double distancePrice;
        if(distance<=2){ distancePrice =6;}
        else if(distance>2 && distance<8){ distancePrice = 6 + (distance-2)*0.8;}
        else {distancePrice = (6 + (8-2)*0.8)+(distance-8)*0.8*1.5;}
        double waitPrice = wait * 0.25;
        return (int)Math.round(distancePrice + waitPrice);
    }

    public String getReceipt() {
        return "收费" + this.getPrice() + "元";
    }
}
