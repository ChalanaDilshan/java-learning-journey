package StudentManagementSystem;

public class UndergraduateStudent extends Student {
    private int Year;

    UndergraduateStudent(int id,String name,int age,String course,int Year){
        super(id,name,age,course);
        this.Year = Year;
    }

    public int getYear(){
        return Year;
    }

    @Override
    public void DisplayInfo(){
        System.out.println("Student ID: "+getId());
        System.out.println("Student Name: "+getName());
        System.out.println("Student Age: "+getAge());
        System.out.println("Couse Name: "+getCourse());
        System.out.println("Year: "+getYear());
    }

}
