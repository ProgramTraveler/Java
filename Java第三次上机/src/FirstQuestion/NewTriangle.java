package FirstQuestion;

public class NewTriangle extends NewGeometricObject implements Comparable{
    private double length1;
    private double length2;
    private double length3;

    public double area;
    public double girth;



    public NewTriangle(double l1,double l2,double l3){
        super();
        this.length1=l1;
        this.length2=l2;
        this.length3=l3;
    }


    @Override
    public double Area() {
        double p=(length1+length2+length3)/2.0;
        area=Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
        return  area;
    }

    @Override
    public double Girth() {
        girth=length1+length2+length3;
        return girth;
    }

    @Override
    public int compareTo(Object o) {
        if(Area()>((NewGeometricObject)o).Area()) return 1;
        else if(Area()==((NewGeometricObject)o).Area()) return 0;
        else return -1;
    }
}
