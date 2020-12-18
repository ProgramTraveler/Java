package Shape;

public class Triangle extends GeometricObject{
    private double length1;
    private double length2;
    private double length3;
    private double girth;
    private double area;
    Triangle(double l1,double l2,double l3){
        length1=l1;
        length2=l2;
        length3=l3;
    }
    public void Area(){
        double p=(length1+length2+length3)/2.0;
        area=Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
    }
    public void Girth(){
        girth=length1+length2+length3;
    }
    public String toString(){
        return "Triangle:"+"面积："+area+" 周长："+girth;
    }
}
