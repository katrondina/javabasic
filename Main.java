public class Main{
    public static void main(String[] arg){
        System.out.println("Hello World, this is Katzi");

        //variable declarations
        int j=10;
        int[] myArray = new int[11];
        //String[] myStringArray = new String[10];
        System.out.println("Sum is "+sum(2,9));
        Car myCar = new Car("Blue", 2.5, 4, 2);
        myCar.hasran(5);
        //myCar.engineSize=5.0;
        System.out.println(myCar.toString());

        //loops
        for(int i=0; i<=j;i++){
           // System.out.print(" Number " + i + ".");
            myArray[i] = i;
           // System.out.print(" Array is " + myArray[i]+".");
           // printInfo("Katrina","09271355011","katrondina@hotmail.com");
        }
    }

    //functions
    public static void printInfo(String myname, String phoneNumber, String email){
        System.out.println("Name: " +myname);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Email: "+email);
    }

    public static int sum(int a, int b){
        return a + b;
    }
}

//Object Oriented Programming
class Car{
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