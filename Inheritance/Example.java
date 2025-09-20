class Students {
    int age;
    String school;
    String email;

    Students(int age,String school,String email){
        this.age = age;
        this.school = school;
        this.email = email;
    }
    
}

class kamal extends Students{
    int marks;
    kamal(int age,String school,String email,int marks){
        super(age, school, email);
        this.marks = marks;
        
    }
}

public class Example{
    public static void main(String[] args) {
        kamal kamal1 = new kamal(15,"abcd","Chalana@gmail.com",75);
        System.out.println(kamal1.school);
        System.out.println(kamal1.email);
    }
}
