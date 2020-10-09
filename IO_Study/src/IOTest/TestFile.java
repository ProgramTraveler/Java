package IOTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] arge) throws IOException {
        //将E:\FilePractice\abc\1.txt封装成File对象

        //方式一：根据字符串形式的路径获取File对象
        File file1=new File("E:\\FilePractice\\abc\\1.txt");
        System.out.println("File1:"+file1);

        //方式二：根据字符串形式的父目录以及子目录创建File对象
        File file2=new File("E:\\FilePractice\\abc","1.txt");
        System.out.println("File2:"+file2);

        //方式三：根据父目录对象，以及字符串形式的子目录来获取File对象
        File file3=new File("E:\\FilePractice\\abc");
        File file4=new File(file3,"1.txt");
        System.out.println("File4:"+file4);

        System.out.println("--------------------------------------------------");

        //创建功能：如果不存在，就创建，返回true，否则就不创建，返回false
        System.out.println("创建功能:");
        //盘符不区分大小写
        //在E盘下的FilePractice下创建一个2.txt
        File file5=new File("E:\\FilePractice\\2.txt");
        boolean flag1=file5.createNewFile();
        System.out.println("Flag1:"+flag1);

        //在E盘下的FilePractice下的abc下创一个a目录
        File file6=new File("E:\\FilePractice\\abc\\a");
        boolean flag2=file6.mkdir(); //mkdir 创建单级目录
        System.out.println("Flag2:"+flag2);

        //在E盘下的FilePractice下的abc下的a目录里创建 b/c文件夹
        File file7=new File("E:\\FilePractice\\abc\\a\\b\\c");
        boolean flag3=file7.mkdirs(); //mkdirs 创建多级目录(也能创建单级)
        System.out.println("Flag3:"+flag3);

        System.out.println("--------------------------------------------------");

        System.out.println("判断功能：");

        File file8=new File("E:\\FilePractice\\abc\\1.txt");
        System.out.println("测试file8是否是文件夹："+file8.isDirectory());
        System.out.println("测试file8是否是文件："+file8.isFile());
        System.out.println("测试file8是否存在："+file8.exists());


    }
}
