package com.tka;

public class Test_address {
    public static void main(String[] args) {

        Country c = new Country();
        System.out.println("Country: " + c.getcountry());

        State s = new State();
        System.out.println("State: " + s.getstate());

        Districat d = new Districat();
        System.out.println("District: " + d.getDistrict());

        City ct = new City();
        System.out.println("City: " + ct.getcity());
    }
}


