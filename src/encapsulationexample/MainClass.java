package encapsulationexample;

public class MainClass {
    public static void main(String[] args) {

// added lines in myownbranch

        //added dummy codes
        Student student1 = new Student();
        student1.setId(123);
        student1.setName("Ajay");
        student1.setEmail("ajay123@gmail.com");
        student1.setGrade("8th grade");

        System.out.println("student1 is : "+student1);

        System.out.println("Student1 name : "+student1.getName());
        System.out.println("Student1 email : "+student1.getEmail());
        System.out.println("Student1 id : "+student1.getId());
        System.out.println("Student1 grade : "+student1.getGrade());

        //firstmain.Student student2 = new firstmain.Student();
    }
}
