public class RectangleDemo {
    private double length;
    private double wide;
    RectangleDemo(double l,double w){
        if(l<0 || w<0){
            throw new ArithmeticException("长宽不能为负数");
        }else{
            length=l;
            wide=w;
        }

    }
    public double girth(){
        return (length+wide)*2;
    }

}
