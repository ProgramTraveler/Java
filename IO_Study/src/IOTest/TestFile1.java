package IOTest;

import java.io.File;

public class TestFile1 {
    public static void main(String[] arge){
        File file1=new File("FilePractice\\abc","1.txt");

        //获取file1的绝对路径,会显示盘符
        String path1=file1.getAbsolutePath();
        System.out.println("绝对路径："+path1);

        //获取file1的相对路径
        String path2=file1.getPath();
        System.out.println("相对路径："+path2);

        //获取文件名
        String FileName=file1.getName();
        System.out.println("文件名："+FileName);

        System.out.println("--------------------------------------------------");

        //获取文件夹下所有文件（夹）的名称数组
        File file2=new File("E:\\FilePractice\\abc");
        String[] names=file2.list();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("--------------------------------------------------");

        //获取文件夹下所有文件（夹）的File数组
        File[] files=file2.listFiles();
        for(File file : files){
            System.out.println(file); //可以调用File的方法，如file.isFile()
        }

    }
}
