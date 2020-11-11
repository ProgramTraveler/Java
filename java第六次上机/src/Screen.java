import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Screen {
    public static void main(String[] args){
        //定义String数组。方便使用随机数来生成数组的下标
        String[] graph={"圆形","矩形","三角形","多边形"};
        //创建一个随机数生成器
        Random ran=new Random();
        //创建GeoManager对象来管理这10个图形
        GeoManager GM=new GeoManager();
        //生产10个随机图形
        for(int i=0;i<10;i++){
            //产生0-3的随机数
            int temp=ran.nextInt(4);
            int temp_len=ran.nextInt(10)+1;

            //创建GeometricObject对象
            GeometricObject GT=new GeometricObject(graph[temp],temp_len);
            //将对象放入容器
            GM.Add(GT);
        }
        //查看移除之前容器中的图形
        GM.check();
        //移出指定位置的图形
        GM.remove(1);
        //检查移除之后容器中的图形
        GM.check();

        GM.classification();




    }
}
