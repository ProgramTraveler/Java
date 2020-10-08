package Shape;

public class DrawingGraphics {
    public static  void main(String[] arge){
        GeometricObject[] geometries=new GeometricObject[3];

        geometries[0]=new Circle(2);
        geometries[0].Area();
        geometries[0].Girth();

        geometries[1]=new Triangle(3,4,5);
        geometries[1].Area();
        geometries[1].Girth();

        geometries[2]=new Rectangle(2,5);
        geometries[2].Area();
        geometries[2].Girth();

        for(int i=0;i<3;i++){
            System.out.println(geometries[i].toString());
        }
    }
}
