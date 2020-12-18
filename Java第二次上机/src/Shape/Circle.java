package Shape;

public class Circle extends GeometricObject{
    private double radius;
    public double girth;
    public double area;

    Circle(double r){
        radius=r;
    }
    public void Area(){
        area=radius*radius*Math.PI*2;
    }
    public void Girth(){
        girth= 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle:"+"面积："+area+" 周长："+girth;
    }


}
