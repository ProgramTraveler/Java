import java.util.*;

public class GeoManager {
    private List<GeometricObject> graph=new ArrayList<GeometricObject>();
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
        for(int i=0;i<graph.size();i++){
            ArrayList<GeometricObject> temp=map.get((graph.get(i)).Name());

            if(temp!=null){
                //System.out.println("no null");
                temp.add((graph.get(i)));
                //Collections.sort(temp);
            }else{

                temp=new ArrayList<GeometricObject>();
                temp.add(graph.get(i));

            }
            System.out.println((graph.get(i)).Name()+":"+temp.size());

            map.put((graph.get(i)).Name(),temp);

        }
    }
    public void Sort(){
        for(int i=0;i<graph.size();i++){
            
        }
    }

}
