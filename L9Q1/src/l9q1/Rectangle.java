
package l9q1;

import java.util.Scanner;

public class Rectangle extends Shape{
    
    private double length;
    private double width;
    
    public Rectangle(){
        super();
        super.display();
        super.getArea();
        super.getPerimeter();
    }
    
    public void setLength(Scanner length){
        this.length = length.nextDouble();
    }
    public void setWidth(Scanner width){
        this.width = width.nextDouble();
    }
    //@Override
    @Override
    public double getPerimeter(){
        return length+length+width+width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
}

