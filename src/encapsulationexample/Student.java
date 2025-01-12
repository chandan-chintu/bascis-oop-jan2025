package encapsulationexample;

public class Student {

    private int id;
    private String name;
    private String email;
    private String grade;
    //int age; // default specifier

    // getters - get/fetch the data
    // setters - set/assign the data


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
