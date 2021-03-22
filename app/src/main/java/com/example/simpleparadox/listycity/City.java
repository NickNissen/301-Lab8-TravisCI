package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    Boolean realCity(String city) {
        return true;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }

}
