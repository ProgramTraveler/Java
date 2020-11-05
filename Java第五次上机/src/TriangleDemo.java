public class TriangleDemo {
    private double len1;
    private double len2;
    private double len3;
    TriangleDemo(double l1,double l2,double l3){
        if(Math.abs(l1-l2)<l3 && l3<l1+l2){
            len1=l1;
            len2=l2;
            len3=l3;
        }else throw new ArithmeticException("不能构成三角形");

    }
    public double girth(){
        return len1+len2+len3;
    }
}
