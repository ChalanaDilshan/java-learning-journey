package StudentManagementSystem;
import java.util.ArrayList;

public class StudentManagementSystem {
    ArrayList<Student> stu = new ArrayList();

    public void addStudent(Student student){
        stu.add(student);
        System.out.println("Student added successfully");
    }

    public void showAllStudents(){
        if (stu.isEmpty()){
            System.out.println("No students are found!");
        }

        for (int i = 0;i < stu.size();i++){
            Student s  = stu.get(i);
            s.DisplayInfo();
            System.out.println("---------------------");
        }
    }

    public void assignCourse(int id,String course){
        for (int i = 0; i < stu.size(); i++){
            Student s = stu.get(i);
            if (s.getId() == id){
                s.setCourse(course);
                System.out.println("Course Assigned Successfully");
                return;
            }

        }

        System.out.println("Student is not found!");
    }
        
}



