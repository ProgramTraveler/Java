package Shape;

public class Rectangle extends GeometricObject{
    private double length;
    private double weight;
    private double girth;
    private double area;
    Rectangle(double l,double w){
        length=l;
        weight=w;
    }
    public void Area(){
        area=length*weight;
    }
    public void Girth(){
        girth=length*weight;
    }
    public String toString(){
        return "Rectangle:"+"面积："+area+" 周长："+girth;
    }
}
