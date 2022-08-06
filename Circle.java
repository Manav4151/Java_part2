// 21CE097 Manav Patel
/*
 Design a class named Circle containing following attributes and behavior.
 •Onedouble data field named radius. The default valueis1.
 •A no-argumentconstructor that creates a default circle.
 •A Single argument constructor that creates a Circle with the specified radius.
 •A method named getArea() that returns area of the Circle.
 •A method named getPerimeter() that returns perimeterof it.
 */

public class Circle {

    double red=1;
    double hig=1;
    double are;

    Circle()
    {
        System.out.println("Default constructor call");
    }

    Circle(double a)
    {
        
        red=a;
        
    }
    Circle(double a,double b)
    {
        red=a;
        hig=b;
    }

    public double getArea(){  // For calculeting Are of circle.
        
        are=3.14*red*red*hig;

        //System.out.println("Area of Circle: "+are);
        return are;
    }
    // get Perimeter for print perameters.
    public void getPerimeter(){
        System.out.println("Radiation of Circle : "+red);
        System.out.println("Hight of Circle: "+hig);
        System.out.println("Area of Circle : "+are);
    }
    

    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(2); 
        Circle c3=new Circle(2,3);

        c1.getArea();
        c2.getArea();
        c2.getPerimeter();
        c3.getArea();
        c3.getPerimeter();
    }
}
