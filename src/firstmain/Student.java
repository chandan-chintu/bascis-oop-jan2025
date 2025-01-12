package firstmain;

public class Student {
    int id;
    String name;
    String email;
    String gender;
    String grade;
    String address;
    int age;

    int pqr=300; // non-static variable
    static int xyz=400; // static variable

    public void demo1(){
        System.out.println("demo1 non-static method inside Student class");
        //demo2(); in the non-static method we can call static as well
    }

    public static void demo2(){
        System.out.println("demo2 static method inside Student class");
        //Student.demo1(); in static method only static should be called
    }

    // converts the object into string format and prints it in output
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name +
                ", email='" + email +
                ", gender='" + gender +
                ", grade='" + grade +
                ", address='" + address +
                ", age=" + age +
                '}';
    }
}
