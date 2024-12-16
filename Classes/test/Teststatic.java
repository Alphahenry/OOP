package test;

//static variable
public class Teststatic {
   
    private int radius;
    int numOfObjects = 0;

    Teststatic (){
      numOfObjects++;
    }

    Teststatic(int newRadius){
        radius = newRadius;
        numOfObjects++;
    }


    public void setRadius(int newRadius){
        this.radius = newRadius;
    }

    //get radius method
    public int getArea(){
        return  (int) (3.14 * radius * radius);
    }
}
