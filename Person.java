public class Person{
    public static int maxID=0;
    private int id;
    private String pname;
    private String phoneNumber;

    Person(String pname, String phone){
        this.id=maxID();
        this.pname=pname;
        this.phoneNumber=phone;
    }

    public static int maxID(){
        int id=maxID;
        maxID++;
        return id;
    }

    public String toString(){
        return "ID: "+this.id+" Name: "+this.pname+" Phone: "+this.phoneNumber;
    }
}