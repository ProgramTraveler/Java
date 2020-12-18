
package FirstQuestion;


public class NewCircle extends NewGeometricObject implements Comparable {

    public double radius;
    public double area;
    public double girth;

    public NewCircle(double r){
        super();
        this.radius=r;
    }

    @Override
    public double Area() {
        this.area=radius*radius*Math.PI;
        return area;
    }

    @Override
    public double Girth() {
        this.girth= 2*Math.PI*radius;
        return girth;
    }

    @Override
    public int compareTo(Object o) {
        //return  (int)(radius*radius*Math.PI*2-((NewCircle)o).radius*((NewCircle)o).radius*Math.PI*2);
       if(Area()>((NewGeometricObject)o).Area()) return 1;
       else if(Area()==((NewGeometricObject)o).Area()) return 0;
       else return -1;


        //return 0;
    }
}

