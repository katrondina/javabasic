//import java.util.ArrayList;

//import java.util.ArrayList;
/*public class Static{
    public static void main(String[] arg){
        System.out.println("Static.java");
        System.out.println("This is to create a class object.");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Katrina","12345","Tondo Manila"));
        studentList.add(new Student("Pau","54321","QC"));

        for(Student a : studentList){
            System.out.println(a.toString());
        }
    }
}

class Stud extends Student{
    public Stud(String name, String Phone, String address){
        super(name, phone, address)
    }
}*/

public class Student{
    private static int maxID=0;
    private int id;
    private String name;
    private String phone;
    private String address;

    Student(String name, String phone, String address){
        this.id=maxID();
        this.name=name;
        this.phone=phone;
        this.address=address;
    }

    private static int maxID(){
        int id = maxID;
        maxID++;
        return id;
    }

    public String toString(){
        return "ID: "+this.id+" Name: "+this.name+" Phone: "+this.phone+" Address: "+this.address;
    }
}