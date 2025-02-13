package firstmain;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone, welcome to Spring1");

        // creating objects
        Student student1 = new Student(); // object of a class student

        // added lines in myownbranch
        // added lines in myownbranch



        System.out.println("student1 before assigning values is : "+student1);

        // assigning values
        student1.id=123;
        student1.name="Ajay";
        student1.address="123,hssio,iowow,ziizol";
        student1.email="ajay123@gmail.com";
        student1.age=12;
        student1.gender="male";
        student1.grade="7th grade";

        System.out.println("student1 after assigning values is : "+student1);

        final int abc;
        abc=200;
        System.out.println("abc is : "+abc);

       //abc=300; cannot update

        final String product_codes_milk = "PR102";

        Student student2 = new Student();
        student2.demo1(); // for non-static methods objects are needed

        Student.demo2(); // for static methods objects are not needed

        System.out.println("pqr is : "+student2.pqr);
        System.out.println("xyz is : "+Student.xyz);
    }
}
