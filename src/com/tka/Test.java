package com.tka;

public class Test {

    public static void main(String[] args) {

        Person pp = new Person();

        Demographics dd = pp.getdetails(23, "Vaishnavi");

        Location ll = dd.giveaddress();

        String city = ll.getcityname();

        System.out.println(city);
    }
}
