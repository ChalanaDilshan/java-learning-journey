package StudentManagementSystem;

public class GraduateStudent extends Student {
    private String thesisTopic;

    GraduateStudent(int id,String name,int age,String course,String thesisTopic){
        super(id,name,age,course);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic(){
        return thesisTopic;
    }

    @Override
    public void DisplayInfo(){
        System.out.println("Student ID: "+getId());
        System.out.println("Student Name: "+getName());
        System.out.println("Student Age: "+getAge());
        System.out.println("Couse Name: "+getCourse());
        System.out.println("Student Topic: "+getThesisTopic());
    }
}
 