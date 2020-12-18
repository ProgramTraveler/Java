import javax.management.relation.InvalidRelationIdException;

public class CircleDemo{
    private double radius;
    CircleDemo(double r){
        if(r<0){
            throw new ArithmeticException("半径不能为负");
        }else {
            radius=r;
        }
    }
    public double girth(){
        return 2*Math.PI*radius;

    }
}


