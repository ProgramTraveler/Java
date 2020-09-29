import java.util.Scanner;
import java.text.DecimalFormat;

public class home_work {
    public static void main(String[] arge)
    {
        first(); //输出hello java
        second(); //计算一个数的阶乘和它的n次方
        third(); //体重计数器
        fourth();
    }
    public static void first()
    {
        System.out.println("Hello,Java!");
    }

    public static void second()
    {
        //float值和double值的输入，计算它们的和，并保留两位小数
        Scanner in=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("please input a float number");
        float a=in.nextFloat();
        //System.out.println(a);

        System.out.println("please input a double number");
        double b=in.nextDouble();

        System.out.println(df.format(a+b));

        //接收一个1~10的数，计算它的阶乘
        System.out.println("please input a int number");
        int c=in.nextInt();

        while (c>10 ||c<0)
        {
            System.out.println("error number,input the number again");
            c=in.nextInt();
        }
        int c_temp=c;

        int temp1=1;
        while(c>0)
        {
            temp1*=c;
            //System.out.println("temp"+temp);
            c--;
        }

        System.out.println(temp1);
        //System.out.println(c);

        //输入整数n，计算输入的那个数的n次方
        System.out.println("please input the n");
        int n=in.nextInt();

        int temp2=1;
        for(int i=0;i<n;i++)
        {
            temp2*=c_temp;
        }
        System.out.println(temp2);
    }

    public static void third()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("please input your height(m)");
        double height=sc.nextDouble();

        System.out.println("please input your weight(kg)");
        double weight=sc.nextDouble();

        double BMI=weight/(height*height);
        System.out.println(BMI);

        if(BMI < 18.5)
            System.out.println("您的体重偏瘦！");
        else if(BMI >= 18.5 && BMI < 25.0)
            System.out.println("您的体重正常！");
        else if(BMI >= 25.0 && BMI < 28.0)
            System.out.println("您的体重偏胖！");
        else if(BMI >= 28.0)
            System.out.println("您的体重肥胖！");
    }

    public static void fourth()
    {
        String s0="aabbb";
        String s1="aa";
        String s2="bbb";
        String s3=s1+s2;

        System.out.println();
        System.out.println("==和equals的区别：");
        System.out.println("string:");
        System.out.println(s3==s0); //编译的时候不知道变量里存的是什么，所以没办法在编译的时候进行优化
        System.out.println(s3.equals(s0));

        StringBuffer s00=new StringBuffer("aabbb");
        StringBuffer s11=new StringBuffer(s00);

        System.out.println("StringBuffer:");
        //因为StringBuffer中没有对equals函数重写，里面相当于是判断变量==变量，即判断是否指向同一个地址，这个时候要比较值是否相等可以转换为String类型。
        System.out.println(s11==s00);
        System.out.println(s11.equals(s00));

        StringBuilder s000=new StringBuilder("aabbb");
        StringBuilder s111=new StringBuilder(s000);

        System.out.println("StringBuilder:");
        //当我们使用StringBuilder创建对象时，肯定会在内存中开辟一个新的专属的地址用于存放对象内容，但是即使StringBuilder中存放的内容与其他字符串的内容相同，使用equals来判断也是返回false，这是因为StringBuilder并没有重写equals函数
        System.out.println(s111==s000);
        System.out.println(s111.equals(s000));

        System.out.println("判断空字符：");
        String str0="";
        StringBuilder str00=new StringBuilder("");
        StringBuffer str000=new StringBuffer("");

        System.out.println("string:");
        System.out.println(str0==null);
        System.out.println(str0.isEmpty());

        System.out.println("StringBuilder:");
        System.out.println(str00!=null&&str00.length()>0);

        System.out.println("StringBuffer:");
        System.out.println(str000.toString()==null);

        //StringUtils strutls1=new StringUtils("123");
        //System.out.println(strutls1);


    }

}
