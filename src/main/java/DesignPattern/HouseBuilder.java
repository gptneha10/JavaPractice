package DesignPattern;

public interface HouseBuilder {

    void setWalls(String walls);
    void setKitchen(String kitchen);
    void setBalcony(String balcony);
    HouseBuilder build();


}
