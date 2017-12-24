
package l9q1;

import java.util.Scanner;

public class Shape {
    
    protected String name;
    protected double perimeter;
    protected double area;
    
    public void setPerimeter(Scanner in){
        this.perimeter = in.nextDouble();
    }
    public void setArea(Scanner in){
        this.area = in.nextDouble();
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    
    public void display(){
        System.out.println(name+"\n");
        System.out.printf("Perimeter : "+perimeter);
        System.out.println("");
        System.out.printf("Area : "+area);
    }
    

}
class Circle extends Shape{
    
    protected double diameter; 
    
    public Circle(){
       super(); 
       super.name = "Circle";
    }
    
    public void setDiameter(Scanner in){
        System.out.print("Diameter(cm) : ");
        this.diameter = in.nextDouble();
    }
    
    @Override
    public double getPerimeter(){
        
        double perimeter;
        final double pi = 3.142;
        
        super.perimeter = perimeter = 2*pi*(diameter/(double)2);
        return perimeter;
    }
    public double getArea(){
        
        double area;
        double r = diameter/(double)2;
        final double pi = 3.142;
             
        area = pi*r*r;
        super.area = area;
        return area;
    }
}
