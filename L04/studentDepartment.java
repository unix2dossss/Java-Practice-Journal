import java.util.ArrayList;

public class studentDepartment {
    public static void main(String[] args){
        Department cs = new Department("Computer Science");
        Student p1 = new Student("Ann", 123);
        Student p2 = new Student("Vandan", 650);
        cs.addStudent(p1); 
        cs.addStudent(p2); 
        System.out.println(cs);
    }
}

class Student{
    private String name;
    private int studentID;

    public Student(String name, int id){
        this.name = name;
        studentID = id;
    }
    public String toString(){
        return String.format("%s(%d)", name, studentID);
    }
}

class Department {
    private String department;
    ArrayList<Student> students = new ArrayList<Student>();
    public Department(String department){
        this.department = department;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String toString(){
        return String.format("%s(number of students=%d)", department, students.size());
    }
}