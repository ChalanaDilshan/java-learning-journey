package StudentManagementSystem;

public class MainMethod {
    public static void main(String[] args){
        StudentManagementSystem sms = new StudentManagementSystem();

        UndergraduateStudent u1 = new UndergraduateStudent(27075, "Chalana Dilshan", 21, "Cyber security", 2022);
        GraduateStudent g1 = new GraduateStudent(22741, "Santha Pallegedara", 27, "ICT", "Academic");

        sms.addStudent(u1);
        sms.addStudent(g1);

        System.out.println("---Show all students---");
        sms.showAllStudents();

        sms.assignCourse(27075, "ICT");
        System.out.println("---Updated Students---");
        sms.showAllStudents();
    }
}
