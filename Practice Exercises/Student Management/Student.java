package StudentManagementSystem;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    Student(int id,String name,int age,String course){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void DisplayInfo(){
        System.out.println("Student ID: "+getId());
        System.out.println("Student Name: "+getName());
        System.out.println("Student Age: "+getAge());
        System.out.println("Couse Name: "+getCourse());
    }
}
