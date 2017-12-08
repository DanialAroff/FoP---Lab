
package l9q1;

public class Square extends Shape{
    
    private double length;
    
    public Square(){
        super();
        super.getPerimeter();
        super.getArea();
        super.display();
    }
    
    public void length(double length){
        this.length = length;
    }
    @Override
    public double getPerimeter(){
        return length*4;
    }
    @Override
    public double getArea(){
        return length*length;
    }
    
}
