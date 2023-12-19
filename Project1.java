import java.util.Scanner;

class Square {
    float length;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lengh of square");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area = length * length;

    }
    public void disp()
    {
        System.out.println("The area of square is :" + area);
    }
}
class Rectangle {
    float length;
    float breadth;
    float area;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area = length * breadth;
    }
    public void disp()
    {
        System.out.println("The area of rectangle is : " + area);
    }
}

class Circle {
    float radius;
    float area;
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = scan.nextFloat();
    }
    public void compute()
    {
        area = (float) (3.14*radius*radius);

    }
    public void disp()
    {
        System.out.println("The area of circle is : " + area);
    }
}

public class Project1 {
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();
    }
    
}
