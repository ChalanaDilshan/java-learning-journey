package Exercise02;

class Shape{
    public static final double PI = 3.14;
    protected double radius = 5;

    public void CalculateArea(){
        System.out.println("Area of the shape");
    }

    public void CalculatePerimeter(){
        System.out.println("Perimeter of the shape");
    }
}

class Circle extends Shape{
    @Override
    public void CalculateArea(){
        System.out.println("Area of the circle is: "+String.format("%.2f",PI*radius*radius));
    }

    @Override
    public void CalculatePerimeter(){
        System.out.println("Area of the circle is: "+String.format("%.2f",2*PI*radius));
    }
}

class Traingle extends Shape{
    @Override
    public void CalculateArea(){
        System.out.println("Area of the traingle is");
    }

    @Override
    public void CalculatePerimeter(){
        System.out.println("Perimeter of the traingle is");
    }
}

public class Shapes{
    public static void main(String[] args) {
        Traingle  traingle1 = new Traingle();
        Circle circle1 = new Circle();

        traingle1.CalculateArea();
        circle1.CalculatePerimeter();
    }
}










