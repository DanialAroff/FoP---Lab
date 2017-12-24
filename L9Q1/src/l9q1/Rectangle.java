
package l9q1;

import java.util.Scanner;

public class Rectangle extends Shape{
    
    private double length;
    private double width;
    
    public Rectangle(){
        super();
        super.name = "Rectangle";
    }
    
    public void setLength(Scanner length){
        System.out.print("Length(cm) : ");
        this.length = length.nextDouble();
    }
    public void setWidth(Scanner width){
        System.out.print("Width(cm) : ");
        this.width = width.nextDouble();
    }
    //@Override
    @Override
    public double getPerimeter(){
        super.perimeter = length+length+width+width;
        return length+length+width+width;
    }
    @Override
    public double getArea(){
        super.area = length*width;
        return length*width;
    }
}

