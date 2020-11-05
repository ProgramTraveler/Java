//多边形类
public class PolygonDemo {
    //多边形边长，边长值不能超过100
    private int count;
    //最多只能有100条边
    private double len[]=new double[100];
    PolygonDemo(int num,double[] len_temp){
        if(num<0){
            throw new ArithmeticException("多边形边数不能为负");
        }else{
            count=num;
            for(int i=0;i<num;i++){
                len[i]=len_temp[i];
            }
        }

    }
    public double girth(){
        double temp=0;
        for(int i=0;i<count;i++){
            temp+=len[i];
        }
        return temp;
    }
}
