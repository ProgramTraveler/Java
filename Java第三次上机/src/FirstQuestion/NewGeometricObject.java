package FirstQuestion;

public abstract class NewGeometricObject implements Comparable {

    //创建抽象方法
    public abstract double Area();

    public abstract double Girth();

    //实现compareTo的方法
    @Override
    public int compareTo(Object o) {
        if (Area() > ((NewGeometricObject) o).Area()) return 1;
        else if (Area() == ((NewGeometricObject) o).Area()) return 0;
        else return -1;
    }
}