package DesignPattern;

class WooddenHouse implements HouseBuilder{
    String walls;
    String kitchen;
    String balcony;

    public void setWalls(String walls){
      this.walls=walls;
    }

    public void setKitchen(String kitchen){
       this.kitchen=kitchen;
    }

    public void setBalcony(String balcony){
        this.balcony=balcony;
    }

    public HouseBuilder build(){
        return new WooddenHouse();
    }

}

class IglooHouse implements HouseBuilder{
    String walls;
    String kitchen;
    String balcony;

    public void setWalls(String walls){
        this.walls=walls;
    }

    public void setKitchen(String kitchen){
        this.kitchen=kitchen;
    }

    public void setBalcony(String balcony){
        this.balcony=balcony;
    }

    public HouseBuilder build(){
        return new IglooHouse();
    }
}

class Engineer {
    private HouseBuilder houseBuilder;

    Engineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public void newBuilder() {
        this.houseBuilder.setBalcony("balcony");
        this.houseBuilder.setKitchen("kitchen");
        this.houseBuilder.setWalls("walls");
    }



}

public class BuilderPatternDemo {

    public static void main(String []args){

       WooddenHouse wooddenHouse=new WooddenHouse();
        Engineer engineer=new Engineer(wooddenHouse);

        engineer.newBuilder();
        HouseBuilder house=wooddenHouse.build();

        System.out.println(house);


        }
    }




