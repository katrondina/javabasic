public class Car{
    private String color;
    private double engineSize;
    private int numberOfDoors;
    private int position;

    //constructor
    public Car(String color, double engSize, int numOfDoos, int pos){
        this.color=color;
        this.engineSize=engSize;
        this.numberOfDoors=numOfDoos;
        this.position=pos;
    }

    public void hasran(int distance){
        position += distance;
    }

    public int getPosition(){
        return this.position;
    }

    public double getEngineSize(){
        return this.engineSize;
    }

    public String toString(){
        String result="";
        result+="Color: " + this.color + "\n";
        result+="Engine Size: " + this.engineSize + "\n";
        result+="Number of Doors: " + this.numberOfDoors + "\n";
        result+="Current Position: " + this.position + "\n";
        return result;
    }
}