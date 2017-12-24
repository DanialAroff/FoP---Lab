
package l9q1;

public class Square extends Shape{
    
    private double length;
    
    public Square(){
        super();
        super.name = "Square";
    }
    
    public void length(double length){
        System.out.print("Length(cm) : ");
        this.length = length;
    }
    @Override
    public double getPerimeter(){
        super.perimeter = length*4;
        return length*4;
    }
    @Override
    public double getArea(){
        super.area = length*length;
        return length*length;
    }
    
}
