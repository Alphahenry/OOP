package car;

public class Car {
    private int mileage;
    private int hp ;
    private String Engine;
    private String Name;
    private int year;


    //create construcor
    Car (){}

    public  Car(int mileage,String Name, int hp, String Engine, int year){
        this.Engine = Engine;
        this.hp = hp;
        this.mileage = mileage;
        this.year = year;
        this.Name = Name;
    }

    //methods

    public String setName(){
        return Name;
    }

    public String getName() {
        return Name;
    }


    public void setEngine(String engine) {
        this.Engine = engine;
    }
    public String getEngine(){
        return Engine;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }


    //actions



}














