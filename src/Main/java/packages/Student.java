package packages;

public class Student {
    String name;
    int rollnumber;
    float marks;

    Student(String name, int rollnumber, float marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    Student() {
    }

    public static void main(String[] args) {
        Student student = new Student("Kundan", 11, 15.6f);
//        student.name = "Chandan";
//        student.rollnumber = 12;
//        student.marks = 12.5f;

        System.out.println(student.name);
        System.out.println(student.marks);
    }

}
