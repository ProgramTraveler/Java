import java.io.*;
import java.util.*;

import static java.util.Collections.sort;

public class GeoManager {
    //记录图形对象
    private List<GeometricObject> graph=new ArrayList<GeometricObject>();
    //使用hashmap容器，按照图形名和图形对象数组的形式储存
    private Map<String,ArrayList<GeometricObject>> map=new HashMap<String,ArrayList<GeometricObject>>();

    //将图形对象存入容器
    public void Add(GeometricObject n){
        graph.add(n);
    }
    //将指定位置的图形对象移除
    public void remove(int n){
        graph.remove(n);
    }
    //检查容器中存在的图形
    public void check(){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+":"+(graph.get(i)).Name()+" ");
        }
        System.out.println();
    }

    //对各图形进行分类
    public void classification(){
        //遍历图形容器
        for(int i=0;i<graph.size();i++){
            //将对应图形名的容器传给temp对象数组
            ArrayList<GeometricObject> temp=map.get((graph.get(i)).Name());
            //检查这个容器是否为空
            if(temp!=null){
                //如果不为空
                //System.out.println("no null");
                //将图形对象加入到这个容器
                temp.add((graph.get(i)));
                //对容器中的对象按照len的大小进行排序
                temp.sort(Comparator.comparing(GeometricObject::Len));
            }else{
                //如果这个容器为空，那么新建一个容器，把对象放入到这个容器中
                temp=new ArrayList<GeometricObject>();
                temp.add(graph.get(i));

            }
            //System.out.println((graph.get(i)).Name()+":"+temp.size());
            //把图形名和改变后的对象数组放进map中
            map.put((graph.get(i)).Name(),temp);
        }
    }

    //显示map中图形名称，以及排序后的边长
    public void show() throws IOException {
        //这个map来按照图形名和它的边长来保存
        Map<String,ArrayList<Integer>> TempM=new HashMap<String,ArrayList<Integer>>();
        //获得map中的key值
        Set<String>set= map.keySet();
        //按key中来遍历
        for(String str : set){
            //System.out.println(map.get((graph.get(i))));
            //记录图形的边长容器
            ArrayList<Integer> temp=new ArrayList<Integer>();
            //获得相应的图形名中的对应的对象容器
            ArrayList<GeometricObject> TempO=map.get(str);

            //System.out.println(TempO.size());
            //遍历这个对象容器
            for(int j=0;j<TempO.size();j++){
                //记录这个对象容器中对应的边长
                temp.add((TempO.get(j)).Len());
            }
            //更新map容器
            TempM.put(str,temp);
        }
        //将文件信息写入文件
        Writer writer=new FileWriter("E:\\JAVA\\java第六次上机\\src\\1.txt");
        writer.write(String.valueOf(TempM));
        //释放资源
        writer.close();
        System.out.println(TempM);

    }

    public void Read() throws IOException {
        //读文件信息
        Reader reader=new FileReader("E:\\JAVA\\java第六次上机\\src\\1.txt");
        int len;
        //字符数组
        char[] ch=new char[20];
        while((len=reader.read(ch))!=-1){
            //将读取到的类容转换成字符串，打印
            /*
                ch:表示要操作的数组
                0:表示起始索引
                len:表示要操作的字符的个数
             */
            String s=new String(ch,0,len);
            System.out.print(s);

        }

        reader.close();
    }

}
